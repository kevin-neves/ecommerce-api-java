package com.example.ecommerce.repository;

import com.example.ecommerce.model.Authority;
import com.example.ecommerce.model.AuthorityKey;
import com.example.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
