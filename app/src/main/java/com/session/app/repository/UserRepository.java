package com.session.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.session.app.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
