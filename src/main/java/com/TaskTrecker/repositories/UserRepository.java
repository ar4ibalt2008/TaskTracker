package com.TaskTrecker.repositories;

import com.TaskTrecker.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
