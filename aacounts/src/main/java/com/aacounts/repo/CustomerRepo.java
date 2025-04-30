package com.aacounts.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aacounts.entity.Customer;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
