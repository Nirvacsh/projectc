package com.example.projectc.repos;

import com.example.projectc.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepos  extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
