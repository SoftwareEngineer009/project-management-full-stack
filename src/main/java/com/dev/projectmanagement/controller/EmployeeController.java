package com.dev.projectmanagement.controller;

import com.dev.projectmanagement.entity.Employee;
import com.dev.projectmanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository empRepo;

    @GetMapping("/new")
    public String displayEmployeeForm(Model model) {
        Employee anEmployee = new Employee();
        model.addAttribute("employee", anEmployee);
        return "new-employee";
    }

    @PostMapping("/save")
    public String addEmployee(Employee employee, Model model) {
        empRepo.save(employee);
        return "redirect:/employees/new";
    }
}
