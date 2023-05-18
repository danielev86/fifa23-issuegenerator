package com.danielev86.fifa23issuefront.controller.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode
@NoArgsConstructor
public class TeamAvgModel implements Serializable {

    private BigDecimal value1 = new BigDecimal(50);

    private BigDecimal value2 = new BigDecimal(50);

    private BigDecimal value3 = new BigDecimal(50);

    private BigDecimal value4 = new BigDecimal(50);

    private BigDecimal value5 = new BigDecimal(50);

    private BigDecimal value6 = new BigDecimal(50);

    private BigDecimal value7 = new BigDecimal(50);

    private BigDecimal value8 = new BigDecimal(50);

    private BigDecimal value9 = new BigDecimal(50);

    private BigDecimal value10 = new BigDecimal(50);

    private BigDecimal value11 = new BigDecimal(50);

}
