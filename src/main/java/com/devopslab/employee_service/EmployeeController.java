package com.devopslab.employee_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @GetMapping("/api/employees")
    public List<Map<String, Object>> getEmployees() {
        return List.of(
            Map.of("id", 1, "name", "John", "department", "DevOps"),
            Map.of("id", 2, "name", "Sarah", "department", "Cloud")
        );
    }
}