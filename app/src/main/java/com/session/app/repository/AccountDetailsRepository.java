package com.session.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.session.app.model.AccountDetails;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Integer>{

}
