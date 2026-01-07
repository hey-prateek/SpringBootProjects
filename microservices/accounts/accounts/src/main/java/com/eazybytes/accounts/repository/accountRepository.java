package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface accountRepository extends JpaRepository<accounts, Long> {

    Optional<accounts> findByCustomerId(Long customerId);

    //want it transactional as it's a delete operation
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
