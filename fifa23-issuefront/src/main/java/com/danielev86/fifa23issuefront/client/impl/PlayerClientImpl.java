package com.danielev86.fifa23issuefront.client.impl;

import com.danielev86.fifa23issuefront.client.IPlayerClient;
import com.danielev86.fifa23issuefront.controller.bean.PlayerIssueDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PlayerClientImpl implements IPlayerClient {

    @Autowired
    private RestTemplate restTemplate;

    public PlayerIssueDTO getPlayerIssue(){
        ResponseEntity<PlayerIssueDTO> response = restTemplate.getForEntity("http://localhost:9001/players/playerissue", PlayerIssueDTO.class);
        return response.getBody();
    }


}
