package com.example.emp_java_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String home() {
        return "Welcome to Employee Salary Processor API 🚀";
    }

    @Autowired
    private EmployeeService service;

    @PostMapping({"/employee", "/emplpyee"})
    public Employee create(@RequestBody Employee e) {
        return service.createEmployee(e);
    }

    @GetMapping("/employee/{id}")
    public Employee getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/employee/all")
    public List<Employee> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/employee/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }

    @PutMapping("/employee/update-salary")
    public Employee updateSalary(@RequestParam Long id, @RequestParam double salary) {
        return service.updateSalary(id, salary);
    }

    @GetMapping("/employee/average-salary")
    public Map<String, Double> avgSalary() {
        return service.averageSalaryPerDepartment();
    }

    @GetMapping("/employee/highest-salary")
    public Employee highestSalary() {
        return service.highestPaidEmployee();
    }

    @GetMapping("/employee/above-average")
    public List<Employee> aboveAverage() {
        return service.employeesAboveAverage();
    }
}
