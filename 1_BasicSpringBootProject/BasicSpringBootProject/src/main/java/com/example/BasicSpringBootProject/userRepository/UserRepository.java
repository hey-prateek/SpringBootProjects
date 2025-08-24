package com.example.BasicSpringBootProject.userRepository;

import com.example.BasicSpringBootProject.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

