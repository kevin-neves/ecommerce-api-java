package com.example.ecommerce.service;

import com.example.ecommerce.dto.UserDTO;
import com.example.ecommerce.model.Authority;
import com.example.ecommerce.model.User;
import com.example.ecommerce.repository.AuthorityRepository;
import com.example.ecommerce.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final AuthorityRepository authorityRepository;
    private final PasswordEncoder encoder;
    private final String ROLE_PREFIX = "ROLE_";

    public void createUser(UserDTO userDTO) {
        userDTO.setPassword(encoder.encode(userDTO.getPassword()));
        User user = User.convert(userDTO);
        userRepository.save(user);
        userDTO.getRoles().forEach(role -> saveAuthority(user, role));
    }

    private void saveAuthority(User user, String role) {
        Authority authority = Authority.convert(user, ROLE_PREFIX + role);
        authorityRepository.save(authority);
    }
}
