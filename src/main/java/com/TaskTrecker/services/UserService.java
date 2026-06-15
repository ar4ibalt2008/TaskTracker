package com.TaskTrecker.services;

import com.TaskTrecker.entities.Task;
import com.TaskTrecker.entities.User;
import com.TaskTrecker.models.TaskDTO;
import com.TaskTrecker.models.UserDTO;
import com.TaskTrecker.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;

    }

    public User createUser(UserDTO dto) {

        User user = new User(dto.getName(), dto.getEmail());
        return userRepository.save(user);

    }

    public List<User> getAllUsers() {

        return userRepository.findAll();

    }

    public void deleteUser(Long id) {

        userRepository.deleteById(id);

    }


}
