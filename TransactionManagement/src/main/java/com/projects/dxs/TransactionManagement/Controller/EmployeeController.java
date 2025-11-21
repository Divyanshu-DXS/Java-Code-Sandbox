package com.projects.dxs.TransactionManagement.Controller;

import com.projects.dxs.TransactionManagement.model.Employee;
import com.projects.dxs.TransactionManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {
        try {
            Employee employeeSaved = employeeService.addEmployee(employee);
            return ResponseEntity.ok(employeeSaved);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Transaction failed: " + e.getMessage());
        }
    }

}
