package com.danielev86.fifa23issueservice.rest.bean;

import com.opencsv.bean.CsvBindByPosition;

import java.io.Serial;
import java.io.Serializable;

public class PlayerDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 773297834320026526L;

    @CsvBindByPosition(position = 0)
    private int issueCode;

    @CsvBindByPosition(position = 1)
    private String issueType;

    @CsvBindByPosition(position = 2)
    private String issueDescription;

    private Integer playerNumber;

    public int getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(int issueCode) {
        this.issueCode = issueCode;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public Integer getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(Integer playerNumber) {
        this.playerNumber = playerNumber;
    }
}
