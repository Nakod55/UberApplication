package com.codingshuttle.project.uber.UberApp.repositories;

import com.codingshuttle.project.uber.UberApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
