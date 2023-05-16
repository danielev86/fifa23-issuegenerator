package com.danielev86.fifa23issuefront.controller;

import com.danielev86.fifa23issuefront.client.ITeamClient;
import com.danielev86.fifa23issuefront.controller.bean.TeamIssueDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private ITeamClient teamClient;

    @GetMapping("/teamissue")
    public String getTeamIssues(Model model){
        TeamIssueDTO teamData = teamClient.getTeamIssue();
        model.addAttribute("teamData", teamData);
        return "teams";
    }

}
