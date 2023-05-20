package com.danielev86.fifa23issueservice.rest;

import com.danielev86.fifa23issueservice.rest.dto.PlayerIssueDTO;
import com.danielev86.fifa23issueservice.rest.dto.TeamDTO;
import com.danielev86.fifa23issueservice.rest.dto.TeamIssueDTO;
import com.danielev86.fifa23issueservice.rest.dto.TransfermarketIssueDTO;
import com.danielev86.fifa23issueservice.service.IFootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class FootballRestController {

    @Autowired
    private IFootballService footballService;

    @GetMapping("/players/playerissue")
    public PlayerIssueDTO getPlayerIssue(){
        Map<Integer, PlayerIssueDTO> mapPlayers = footballService.getMapPlayerIssuers();
        int randomNum = ThreadLocalRandom.current().nextInt(1, 27 + 1);
        PlayerIssueDTO playerDTO = mapPlayers.get(randomNum);
        if (playerDTO == null){
            playerDTO = new PlayerIssueDTO();
            playerDTO.setIssueType("Nessun Imprevisto Generato".toUpperCase());
        }else{
            playerDTO.setPlayerNumber(ThreadLocalRandom.current().nextInt(1,18));
        }
        return playerDTO;
    }

    @GetMapping("/teams/teamsissue")
    public TeamIssueDTO getTeamIssue(){
        Map<Integer, TeamIssueDTO> mapTeams = footballService.getMapFinancialIssuers();
        int randomNum = ThreadLocalRandom.current().nextInt(1, 16 + 1);
        TeamIssueDTO teamDTO = mapTeams.get(randomNum);
        if (teamDTO == null){
            teamDTO = new TeamIssueDTO();
            teamDTO.setIssueType("Nessun Imprevisto Generato".toUpperCase());
        }
        return teamDTO;
    }

    @GetMapping("/teams/marketissue")
    public TransfermarketIssueDTO getTransfermarketIssue(){
        Map<Integer, TransfermarketIssueDTO> mapTeams = footballService.getTransfermarketdto();
        int randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        TransfermarketIssueDTO teamDTO = mapTeams.get(randomNum);
        if (teamDTO == null){
            teamDTO = new TransfermarketIssueDTO();
            teamDTO.setIssueType("Nessun Imprevisto Generato".toUpperCase());
        }
        return teamDTO;
    }

}
