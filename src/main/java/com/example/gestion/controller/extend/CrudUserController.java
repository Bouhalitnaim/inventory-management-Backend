package com.example.gestion.controller.extend;

import com.example.gestion.controller.CrudController;
import com.example.gestion.entity.Role;
import com.example.gestion.entity.User;
import com.example.gestion.repository.RoleRepository;
import com.example.gestion.util.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/crud_user")
public class CrudUserController extends CrudController<User , Long> {


    @Autowired
    private RoleRepository roleRepository;

    public List<User> getAll() {
       List<User> users = super.getAll();
       users.forEach(user -> user.setPassword(null));
       return users;
    }


    public void add(@RequestBody User user)
    {
        Role role =roleRepository.findByName(RoleEnum.ROLE_USER.getName());
        user.setRoles(Arrays.asList(role));
        user.setEnable(true);
        super.add(user);
    }


}


