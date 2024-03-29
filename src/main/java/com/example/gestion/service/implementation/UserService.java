package com.example.gestion.service.implementation;


import com.example.gestion.entity.User;
import com.example.gestion.repository.UserRepository;
import com.example.gestion.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserService implements ICrudService<User,Long> {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(User user) {
        userRepository.save(user);

    }

    @Override
    public void delete(Long id) {
        User user = new User();
      user.setId(id);
        userRepository.delete(user);



    }
}
