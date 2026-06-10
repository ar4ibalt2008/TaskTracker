package com.TaskTrecker.models;

import com.TaskTrecker.entities.enums.TaskStatus;
import lombok.Data;
import lombok.Setter;
import lombok.Getter;


@Data
public class TaskDTO {
    private String title;
    private String description;
    private TaskStatus status;
}
