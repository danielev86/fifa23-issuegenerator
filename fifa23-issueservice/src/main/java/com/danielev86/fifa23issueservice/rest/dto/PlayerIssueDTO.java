package com.danielev86.fifa23issueservice.rest.dto;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

@Data
@EqualsAndHashCode
public class PlayerIssueDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 773297834320026526L;

    @CsvBindByPosition(position = 0)
    private int issueCode;

    @CsvBindByPosition(position = 1)
    private String issueType;

    @CsvBindByPosition(position = 2)
    private String issueDescription;

    private Integer playerNumber;

}
