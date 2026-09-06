package com.example.__basicUserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.__basicUserService.entity.User;

public interface userRepo extends JpaRepository<User, Long> {

}
