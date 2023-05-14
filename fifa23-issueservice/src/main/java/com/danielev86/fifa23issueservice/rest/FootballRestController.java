package com.danielev86.fifa23issueservice.rest;

import com.danielev86.fifa23issueservice.rest.bean.PlayerDTO;
import com.danielev86.fifa23issueservice.rest.bean.TeamDTO;
import com.danielev86.fifa23issueservice.service.IFootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class FootballRestController {

    @Autowired
    private IFootballService footballService;

    @GetMapping("/players/playerissue")
    public PlayerDTO getPlayerIssue(){
        Map<Integer, PlayerDTO> mapPlayers = footballService.getMapPlayerIssuers();
        int randomNum = ThreadLocalRandom.current().nextInt(1, mapPlayers.keySet().size() + 1);
        PlayerDTO playerDTO = mapPlayers.get(randomNum);
        if (playerDTO == null){
            playerDTO = new PlayerDTO();
            playerDTO.setIssueType("Nessun Imprevisto Generato".toUpperCase());
        }else{
            playerDTO.setPlayerNumber(ThreadLocalRandom.current().nextInt(1,18));
        }
        return playerDTO;
    }

    @GetMapping("/teams/teamsissue")
    public TeamDTO getTeamIssue(){
        Map<Integer, TeamDTO> mapTeams = footballService.getMapFinancialIssuers();
        int randomNum = ThreadLocalRandom.current().nextInt(1, mapTeams.keySet().size() + 1);
        TeamDTO teamDTO = mapTeams.get(randomNum);
        if (teamDTO == null){
            teamDTO = new TeamDTO();
            teamDTO.setIssueType("Nessun Imprevisto Generato".toUpperCase());
        }
        return teamDTO;
    }

}
