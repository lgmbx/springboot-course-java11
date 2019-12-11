package com.localhost.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.localhost.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
