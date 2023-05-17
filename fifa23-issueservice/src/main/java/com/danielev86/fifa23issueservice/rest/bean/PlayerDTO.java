package com.danielev86.fifa23issueservice.rest.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode
public class PlayerDTO implements Serializable {

    private String firstName;

    private String lastName;

    private int numPosition;

    private BigDecimal avg = BigDecimal.ZERO;

}
