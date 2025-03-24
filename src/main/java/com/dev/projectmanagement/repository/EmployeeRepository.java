package com.dev.projectmanagement.repository;

import com.dev.projectmanagement.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
