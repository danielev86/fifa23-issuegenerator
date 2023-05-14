package com.danielev86.fifa23issueservice.service;

import com.danielev86.fifa23issueservice.rest.bean.PlayerDTO;
import com.danielev86.fifa23issueservice.rest.bean.TeamDTO;
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

    public Map<Integer, PlayerDTO> getMapPlayerIssuers(){
        return csvParser.findPlayerIssues().stream().collect(Collectors.toMap(PlayerDTO::getIssueCode, Function.identity()));
    }

    public Map<Integer, TeamDTO> getMapFinancialIssuers(){
        return csvParser.findFinancialIssues().stream().collect(Collectors.toMap(TeamDTO::getIssueCode, Function.identity()));
    }

}
