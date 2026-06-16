package com.TaskTrecker.services;

import com.TaskTrecker.entities.Task;
import com.TaskTrecker.entities.enums.TaskStatus;
import com.TaskTrecker.models.TaskDTO;
import com.TaskTrecker.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {

        this.taskRepository = taskRepository;

    }


    public Task createTask(TaskDTO dto) {

        Task task = new Task(dto.getTitle(), dto.getDescription());
        return taskRepository.save(task);

    }

    public List<Task> getAllTasks() {

        return taskRepository.findAll();

    }

    public void deleteTask(Long id) {

        taskRepository.deleteById(id);

    }

    public Task toggleTaskStatus(Long id) {

        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Задача не найдена: " + id));

        if (task.getStatus() == TaskStatus.TODO) {
            task.setStatus(TaskStatus.IN_PROGRESS);
        } else if (task.getStatus() == TaskStatus.IN_PROGRESS) {
            task.setStatus(TaskStatus.DONE);
        } else {
            task.setStatus(TaskStatus.TODO);
        }

        return taskRepository.save(task);

    }
}