package com.danielev86.fifa23issuefront.client;

import com.danielev86.fifa23issuefront.controller.dto.TeamIssueDTO;
import com.danielev86.fifa23issuefront.controller.dto.TransfermarketIssueDTO;

public interface ITeamClient {

    TeamIssueDTO getTeamIssue();

    TransfermarketIssueDTO getMarketIssue();

}
