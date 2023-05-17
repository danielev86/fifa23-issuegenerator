package com.danielev86.fifa23issuefront.controller;

import com.danielev86.fifa23issuefront.client.IPlayerClient;
import com.danielev86.fifa23issuefront.controller.dto.PlayerIssueDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private IPlayerClient playerClient;

    @GetMapping("/playersissue")
    public String getPlayerIssue(Model model){
        PlayerIssueDTO playerResult = playerClient.getPlayerIssue();
        model.addAttribute("playerResult", playerResult);
        return "players";
    }

}
