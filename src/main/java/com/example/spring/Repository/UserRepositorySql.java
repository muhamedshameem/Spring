package com.example.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.Entity.User;

public interface UserRepositorySql extends JpaRepository<User, Long>{

}
