package com.example.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Role {

    @Id
    @GeneratedValue
    private Long role_id;

    private String role;

    public Role(){

    }

    public Role(String role) {
        this.role = role;
    }


    @ManyToMany(fetch = FetchType.EAGER,cascade ={CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users=new ArrayList<>();

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", role='" + role + '\'' +
                '}';
    }


}
