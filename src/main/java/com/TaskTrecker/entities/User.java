package com.TaskTrecker.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Task> tasks;


    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

}
