package com.danielev86.fifa23issuefront.controller.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class PlayerIssueDTO implements Serializable {

    private int issueCode;

    private String issueType;

    private String issueDescription;

    private Integer playerNumber;

}
