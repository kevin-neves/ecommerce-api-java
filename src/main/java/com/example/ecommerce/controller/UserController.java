package com.example.ecommerce.controller;

import com.example.ecommerce.dto.request.UserRequest;
import com.example.ecommerce.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping
    public Principal getUser(Principal principal) { return principal; }

    @PostMapping
    public void saveUser(@RequestBody UserRequest userDTO) {
        userService.createUser(userDTO);
    }
}
