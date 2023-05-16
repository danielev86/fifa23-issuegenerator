package com.danielev86.fifa23issuefront.controller.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@Data
@EqualsAndHashCode
public class TeamAvgDTO implements Serializable {

    private List<BigDecimal> values;

}
