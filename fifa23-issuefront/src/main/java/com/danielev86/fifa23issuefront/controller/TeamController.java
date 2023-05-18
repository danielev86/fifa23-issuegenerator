package com.danielev86.fifa23issuefront.controller;

import com.danielev86.fifa23issuefront.client.ITeamClient;
import com.danielev86.fifa23issuefront.controller.dto.TeamDTO;
import com.danielev86.fifa23issuefront.controller.dto.TeamIssueDTO;
import com.danielev86.fifa23issuefront.controller.model.TeamAvgModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
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

    @GetMapping("/teamsAvg")
    public String getTeamAvg(Model model) {
        model.addAttribute("teamAvg", new TeamAvgModel());
        return "teamsAvg";
    }

    @GetMapping("/teamsAvg/avg")
    public String getCalculateAvgTeam(Model model) {
        model.addAttribute("teamAvg", model.asMap().get("teamAvg"));
        model.addAttribute("value", model.asMap().get("value"));
        return "teamsAvg";
    }

    @PostMapping("/teamsAvg/avg")
    public String getCalculateAvgTeam(@ModelAttribute("teamAvg") TeamAvgModel team
            , BindingResult bindingResult
            , RedirectAttributes model){
        BigDecimal value = new BigDecimal(100);
        model.addFlashAttribute("value", value);
        model.addFlashAttribute("teamAvg", team);
        return "redirect:/teamsAvg/avg";
    }

}
