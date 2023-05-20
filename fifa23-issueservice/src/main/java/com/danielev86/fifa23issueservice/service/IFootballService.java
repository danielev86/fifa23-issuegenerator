package com.danielev86.fifa23issueservice.service;

import com.danielev86.fifa23issueservice.rest.dto.PlayerIssueDTO;
import com.danielev86.fifa23issueservice.rest.dto.TeamIssueDTO;
import com.danielev86.fifa23issueservice.rest.dto.TransfermarketIssueDTO;

import java.math.BigDecimal;
import java.util.Map;

public interface IFootballService {
    Map<Integer, PlayerIssueDTO> getMapPlayerIssuers();

    Map<Integer, TeamIssueDTO> getMapFinancialIssuers();

    Map<Integer, TransfermarketIssueDTO> getTransfermarketdto();

}
