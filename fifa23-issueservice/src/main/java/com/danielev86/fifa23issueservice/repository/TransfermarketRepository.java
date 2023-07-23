package com.danielev86.fifa23issueservice.repository;

import com.danielev86.fifa23issueservice.repository.model.TransfermarketIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransfermarketRepository extends JpaRepository<TransfermarketIssue, Long> {
}
