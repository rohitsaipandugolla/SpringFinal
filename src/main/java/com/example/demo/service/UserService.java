package com.example.demo.service;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void createUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        HashSet<Role>roles=new HashSet<>();
        Role role2=roleRepository.findById(Long.parseLong("1")).orElseThrow();
        roles.add(role2);
        user.setRoles(roles);
        userRepository.save(user);
    }

    public User getUser(Long id){
           return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }


    public void deleteUser(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        userRepository.delete(user);
    }

    public String findUserName(String name){
        return userRepository.findName(name);
    }


    public void changeRole(Long userId,Role role){
        User user=userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        if(user.getRoles()!=null) {
            user.setRoles(null);
        }
        HashSet<Role>roles=new HashSet<>();

        if(role.getRole().equals("ROLE_ADMIN")){
            Role role1=roleRepository.findById(Long.parseLong("2")).orElseThrow();
            roles.add(role1);
        }
        else{
            Role role2=roleRepository.findById(Long.parseLong("1")).orElseThrow();
            roles.add(role2);
        }
        user.setRoles(roles);
        userRepository.save(user);
    }


}
