package com.danielev86.fifa23issueservice.repository;

import com.danielev86.fifa23issueservice.repository.model.TeamIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamIssueRepository extends JpaRepository<TeamIssue, Long> {
}
