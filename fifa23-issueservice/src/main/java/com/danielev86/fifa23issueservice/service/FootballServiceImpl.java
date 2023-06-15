package com.danielev86.fifa23issueservice.service;

import com.danielev86.fifa23issueservice.delegate.CalculatorDelegate;
import com.danielev86.fifa23issueservice.rest.dto.PlayerIssueDTO;
import com.danielev86.fifa23issueservice.rest.dto.TeamIssueDTO;
import com.danielev86.fifa23issueservice.delegate.CsvParserDelegate;
import com.danielev86.fifa23issueservice.rest.dto.TransfermarketIssueDTO;
import com.danielev86.fifa23issueservice.utility.Fifa23Utility;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.danielev86.fifa23issueservice.utility.Fifa23Utility.generateRandomNumber;

@Service("footballService")
public class FootballServiceImpl implements IFootballService {

    @Autowired
    private CsvParserDelegate csvParser;

    public PlayerIssueDTO generatePlayerIssue(){
        Map<Integer, PlayerIssueDTO> mapPlayers = csvParser.findPlayerIssues().stream().collect(Collectors.toMap(PlayerIssueDTO::getIssueCode, Function.identity()));
        int randomNum = generateRandomNumber(1,34+1);
        PlayerIssueDTO playerDTO = mapPlayers.get(randomNum);
        if (playerDTO == null){
            playerDTO = new PlayerIssueDTO();
            playerDTO.setIssueType("Nessun Imprevisto Generato".toUpperCase());
        }else{
            playerDTO.setPlayerNumber(ThreadLocalRandom.current().nextInt(1,18));
        }
        return playerDTO;
    }

    public TeamIssueDTO generateTeamIssue(){
       Map<Integer,TeamIssueDTO> mapTeams = csvParser.findFinancialIssues().stream().collect(Collectors.toMap(TeamIssueDTO::getIssueCode, Function.identity()));
       int randomNum = generateRandomNumber(1,16+1);
       TeamIssueDTO teamDTO = mapTeams.get(randomNum);
       if (teamDTO == null){
           teamDTO = new TeamIssueDTO();
           teamDTO.setIssueType("Nessun Imprevisto Generato".toUpperCase());
       }
       return teamDTO;

    }

    public TransfermarketIssueDTO generateTransferIssue(){
        Map<Integer, TransfermarketIssueDTO> mapTransfer = csvParser.findMarketIssues().stream().collect(Collectors.toMap(TransfermarketIssueDTO::getIssueCode, Function.identity()));
        int randomNum = generateRandomNumber(1,39+1);
        TransfermarketIssueDTO teamDTO = mapTransfer.get(randomNum);
        if (teamDTO == null){
            teamDTO = new TransfermarketIssueDTO();
            teamDTO.setIssueType("Nessun Imprevisto Generato".toUpperCase());
        }else if (teamDTO != null && randomNum == 26){

        }
        return teamDTO;
    }

}
