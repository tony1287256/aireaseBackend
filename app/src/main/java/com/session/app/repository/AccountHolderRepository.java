package com.session.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.session.app.model.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder,Integer> {

}
