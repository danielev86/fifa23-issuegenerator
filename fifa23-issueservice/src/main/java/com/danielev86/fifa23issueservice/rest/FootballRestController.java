package com.danielev86.fifa23issueservice.rest;

import com.danielev86.fifa23issueservice.rest.bean.PlayerIssueDTO;
import com.danielev86.fifa23issueservice.rest.bean.TeamAvgDTO;
import com.danielev86.fifa23issueservice.rest.bean.TeamDTO;
import com.danielev86.fifa23issueservice.rest.bean.TeamIssueDTO;
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
        int randomNum = ThreadLocalRandom.current().nextInt(1, mapPlayers.keySet().size() + 1);
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
        int randomNum = ThreadLocalRandom.current().nextInt(1, mapTeams.keySet().size() + 1);
        TeamIssueDTO teamDTO = mapTeams.get(randomNum);
        if (teamDTO == null){
            teamDTO = new TeamIssueDTO();
            teamDTO.setIssueType("Nessun Imprevisto Generato".toUpperCase());
        }
        return teamDTO;
    }

    @PostMapping("/teams/calculateavg")
    public TeamDTO getCalculateAvgTeam(TeamAvgDTO teamValues){
        BigDecimal avg = footballService.calculateAvgTeams(teamValues);
        TeamDTO team = new TeamDTO();
        team.setAvg(avg);
        return team;
    }

}
