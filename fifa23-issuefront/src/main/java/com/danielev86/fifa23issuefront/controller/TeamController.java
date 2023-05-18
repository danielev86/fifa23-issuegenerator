package com.danielev86.fifa23issuefront.controller;

import com.danielev86.fifa23issuefront.client.ITeamClient;
import com.danielev86.fifa23issuefront.controller.dto.TeamIssueDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.math.BigDecimal;

@Controller
@RequestMapping("/")
public class TeamController {

    @Autowired
    private ITeamClient teamClient;

    @GetMapping("/teams/teamissue")
    public String getTeamIssues(Model model){
        TeamIssueDTO teamData = teamClient.getTeamIssue();
        model.addAttribute("teamData", teamData);
        return "teams";
    }

}
