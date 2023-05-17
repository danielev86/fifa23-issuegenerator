package com.danielev86.fifa23issueservice.service;

import com.danielev86.fifa23issueservice.rest.bean.PlayerIssueDTO;
import com.danielev86.fifa23issueservice.rest.bean.TeamAvgDTO;
import com.danielev86.fifa23issueservice.rest.bean.TeamIssueDTO;

import java.math.BigDecimal;
import java.util.Map;

public interface IFootballService {
    Map<Integer, PlayerIssueDTO> getMapPlayerIssuers();

    Map<Integer, TeamIssueDTO> getMapFinancialIssuers();

    BigDecimal calculateAvgTeams(TeamAvgDTO avgTeam);

}
