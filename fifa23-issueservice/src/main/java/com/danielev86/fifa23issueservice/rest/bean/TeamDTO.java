package com.danielev86.fifa23issueservice.rest.bean;


import com.opencsv.bean.CsvBindByPosition;

import java.io.Serial;
import java.io.Serializable;

public class TeamDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 2649937780567140449L;

    @CsvBindByPosition(position = 0)
    private int issueCode;

    @CsvBindByPosition(position = 1)
    private String issueType;

    @CsvBindByPosition(position = 2)
    private String issueDescription;

    @CsvBindByPosition(position = 3)
    private String issueFullDescription;

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

    public String getIssueFullDescription() {
        return issueFullDescription;
    }

    public void setIssueFullDescription(String issueFullDescription) {
        this.issueFullDescription = issueFullDescription;
    }
}
