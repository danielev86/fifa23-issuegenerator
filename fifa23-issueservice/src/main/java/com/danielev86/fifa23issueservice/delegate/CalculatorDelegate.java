package com.danielev86.fifa23issueservice.delegate;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.List;

@Component
public class CalculatorDelegate {

    public BigDecimal calculateAvg(List<BigDecimal> valElements){
        BigDecimal value = null;
        if (CollectionUtils.isNotEmpty(valElements)) {
            for (BigDecimal valElement : valElements){
                value = value != null ? value.add(valElement) : valElement;
            }
            value = value.divide(new BigDecimal(valElements.size()), 2, RoundingMode.UP);
        }
        return value;
    }

}
