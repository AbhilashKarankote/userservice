package com.scaler.userservice.services;

import com.mysql.cj.util.StringUtils;
import com.scaler.userservice.models.User;
import com.scaler.userservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
         userRepository.deleteById(id);
    }

    public User updateUser(Long id, User user) {
        User dbUser = userRepository.findById(id).get();
        if(StringUtils.isNullOrEmpty(user.getName().getFirstName())){

        }
        return new User();
    }
}
