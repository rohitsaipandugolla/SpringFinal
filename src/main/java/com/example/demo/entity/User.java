package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    @Column(unique = true)
    private String name;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER,cascade ={CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles=new HashSet<>();

    public User(){

    }


    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void addRole(Role role){
        if (roles == null){
            this.roles = new HashSet<>();
        }
        if(!roles.contains(role)){
            this.roles.add(role);
        }
    }


}