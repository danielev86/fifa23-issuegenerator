package com.danielev86.fifa23issueservice.service;

import com.danielev86.fifa23issueservice.rest.bean.PlayerIssueDTO;
import com.danielev86.fifa23issueservice.rest.bean.TeamIssueDTO;
import com.danielev86.fifa23issueservice.delegate.CsvParserDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service("footballService")
public class FootballServiceImpl implements IFootballService {

    @Autowired
    private CsvParserDelegate csvParser;

    public Map<Integer, PlayerIssueDTO> getMapPlayerIssuers(){
        return csvParser.findPlayerIssues().stream().collect(Collectors.toMap(PlayerIssueDTO::getIssueCode, Function.identity()));
    }

    public Map<Integer, TeamIssueDTO> getMapFinancialIssuers(){
        return csvParser.findFinancialIssues().stream().collect(Collectors.toMap(TeamIssueDTO::getIssueCode, Function.identity()));
    }

}
