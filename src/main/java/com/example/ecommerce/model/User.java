package com.example.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity(name = "users")
public class User {

    @Id
    @Column(name = "username")
    private String userName;
    private String password;
    private Boolean enabled;

    @OneToMany(mappedBy = "user")
    private List<Authority> authorityList = new ArrayList<>();
}
