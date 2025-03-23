package com.dev.projectmanagement.repository;

import com.dev.projectmanagement.entity.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {

}
