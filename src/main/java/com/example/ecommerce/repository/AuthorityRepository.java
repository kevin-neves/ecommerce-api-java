package com.example.ecommerce.repository;


import com.example.ecommerce.model.Authority;
import com.example.ecommerce.model.AuthorityKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, AuthorityKey> {
}
