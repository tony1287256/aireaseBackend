package com.session.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.session.app.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
