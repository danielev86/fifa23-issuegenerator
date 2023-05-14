package com.danielev86.fifa23issueservice.service;

import com.danielev86.fifa23issueservice.rest.bean.PlayerDTO;
import com.danielev86.fifa23issueservice.rest.bean.TeamDTO;

import java.util.Map;

public interface IFootballService {
    public Map<Integer, PlayerDTO> getMapPlayerIssuers();

    public Map<Integer, TeamDTO> getMapFinancialIssuers();

}
