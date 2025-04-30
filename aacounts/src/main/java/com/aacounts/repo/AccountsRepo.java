package com.aacounts.repo;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.aacounts.entity.Accounts;

import java.util.Optional;

public interface AccountsRepo extends JpaRepository<Accounts, Long> {
    Optional<Accounts> findByCustomerId(Long customerId);

    @Transactional
    @Modifying	//Tells jpa that this query is going to modify the data
    void deleteByCustomerId(Long customerId);
}
