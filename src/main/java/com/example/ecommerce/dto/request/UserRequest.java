package com.example.ecommerce.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class UserRequest {
    private String username;
    private String password;
    private Boolean enabled;
    private List<String> roles;


}
