package com.danielev86.fifa23issuefront.client.impl;

import com.danielev86.fifa23issuefront.client.ITeamClient;
import com.danielev86.fifa23issuefront.controller.bean.TeamIssueDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TeamClientImpl implements ITeamClient {

    private static final String BASE_URI = "http://localhost:9001";

    @Autowired
    private RestTemplate restTemplate;

    public TeamIssueDTO getTeamIssue(){
        ResponseEntity<TeamIssueDTO> response = restTemplate.getForEntity(BASE_URI + "/teams/teamsissue", TeamIssueDTO.class);
        return response.getBody();
    }
}
