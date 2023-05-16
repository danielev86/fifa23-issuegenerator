package com.danielev86.fifa23issueservice.service;

import com.danielev86.fifa23issueservice.rest.bean.PlayerIssueDTO;
import com.danielev86.fifa23issueservice.rest.bean.TeamIssueDTO;

import java.util.Map;

public interface IFootballService {
    public Map<Integer, PlayerIssueDTO> getMapPlayerIssuers();

    public Map<Integer, TeamIssueDTO> getMapFinancialIssuers();

}
