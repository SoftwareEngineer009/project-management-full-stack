package com.dev.projectmanagement.controller;

import com.dev.projectmanagement.entity.Employee;
import com.dev.projectmanagement.entity.Project;
import com.dev.projectmanagement.repository.EmployeeRepository;
import com.dev.projectmanagement.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProjectRepository proRepo;

    @Autowired
    EmployeeRepository empRepo;

    @GetMapping("/")
    public String displayProjects(Model model) {
        List<Project> projects = proRepo.findAll();
        model.addAttribute("projectsList", projects);

        List<Employee> employees = empRepo.findAll();
        model.addAttribute("employeesList", employees);
        return "home";
    }
}