package com.danielev86.fifa23issuefront.controller.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class TeamDTO implements Serializable {

    private int issueCode;

    private String issueType;

    private String issueDescription;

    private String issueFullDescription;

}
