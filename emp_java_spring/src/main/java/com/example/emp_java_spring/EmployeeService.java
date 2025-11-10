package com.example.emp_java_spring;

import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final List<Employee> employees = Collections.synchronizedList(new ArrayList<>());
    private final AtomicLong idGenerator = new AtomicLong(1);

    public Employee createEmployee(Employee e) {
        e.setId(idGenerator.getAndIncrement());
        employees.add(e);
        return e;
    }

    public Employee getById(Long id) {
        return employees.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found"));
    }

    public List<Employee> getAll() {
        return new ArrayList<>(employees);
    }

    public void deleteById(Long id) {
        boolean removed = employees.removeIf(emp -> emp.getId().equals(id));
        if (!removed)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
    }

    public Employee updateSalary(Long id, double newSalary) {
        Employee emp = getById(id);
        emp.setSalary(newSalary);
        return emp;
    }

    public Map<String, Double> averageSalaryPerDepartment() {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
    }

    public Employee highestPaidEmployee() {
        return employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No employees available"));
    }

    public List<Employee> employeesAboveAverage() {
        double overallAvg = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
        return employees.stream()
                .filter(e -> e.getSalary() > overallAvg)
                .collect(Collectors.toList());
    }
}

