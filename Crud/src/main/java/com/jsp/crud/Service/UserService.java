package com.jsp.crud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.crud.dao.Order;
import com.jsp.crud.dao.User;
import com.jsp.crud.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    public User createUser(User user) {
    	User createUser = userRepository.save(user);
        return createUser;
    }

    public User updateUser(Long userId, User updatedUser) {
        
        if (userRepository.existsById(userId)) {
     
            updatedUser.setId(userId);
            return userRepository.save(updatedUser);
        } else {
            return null;
        }
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
