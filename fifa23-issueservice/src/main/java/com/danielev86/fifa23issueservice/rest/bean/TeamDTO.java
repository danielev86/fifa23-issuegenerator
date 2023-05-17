package com.danielev86.fifa23issueservice.rest.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@EqualsAndHashCode
public class TeamDTO implements Serializable {

    private String teamName;

    private List<PlayerDTO> players;

    private BigDecimal avg;

}
