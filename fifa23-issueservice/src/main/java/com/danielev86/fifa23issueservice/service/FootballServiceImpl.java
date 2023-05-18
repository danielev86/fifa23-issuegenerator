package com.danielev86.fifa23issueservice.service;

import com.danielev86.fifa23issueservice.delegate.CalculatorDelegate;
import com.danielev86.fifa23issueservice.rest.dto.PlayerIssueDTO;
import com.danielev86.fifa23issueservice.rest.dto.TeamIssueDTO;
import com.danielev86.fifa23issueservice.delegate.CsvParserDelegate;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service("footballService")
public class FootballServiceImpl implements IFootballService {

    @Autowired
    private CsvParserDelegate csvParser;

    @Autowired
    private CalculatorDelegate calculatorDelegate;

    public Map<Integer, PlayerIssueDTO> getMapPlayerIssuers(){
        return csvParser.findPlayerIssues().stream().collect(Collectors.toMap(PlayerIssueDTO::getIssueCode, Function.identity()));
    }

    public Map<Integer, TeamIssueDTO> getMapFinancialIssuers(){
        return csvParser.findFinancialIssues().stream().collect(Collectors.toMap(TeamIssueDTO::getIssueCode, Function.identity()));
    }

}
