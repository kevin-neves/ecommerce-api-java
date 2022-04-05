package com.example.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class UserDTO {

    private String userName;
    private String password;
    private Boolean enabled;
    private List<String> roles;
}
