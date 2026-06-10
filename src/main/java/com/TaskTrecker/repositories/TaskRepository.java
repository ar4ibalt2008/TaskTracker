package com.TaskTrecker.repositories;

import com.TaskTrecker.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
