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
        return footballService.generatePlayerIssue();
    }

    @GetMapping("/teams/teamsissue")
    public TeamIssueDTO getTeamIssue(){
        return footballService.generateTeamIssue();
    }

    @GetMapping("/teams/marketissue")
    public TransfermarketIssueDTO getTransfermarketIssue(){
        return footballService.generateTransferIssue();
    }

}
