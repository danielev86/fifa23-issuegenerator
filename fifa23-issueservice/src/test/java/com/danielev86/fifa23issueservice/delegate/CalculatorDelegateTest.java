package com.danielev86.fifa23issueservice.delegate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CalculatorDelegateTest {

    @Autowired
    private CalculatorDelegate calculatorDelegate;

    @Test
    public void calculateAvgWithAllValue(){
        List<BigDecimal> values = new ArrayList<>();
        for (int i = 0; i < 11; i++){
            values.add(new BigDecimal("80"));
        }
        Assertions.assertTrue((new BigDecimal(80)).compareTo(calculatorDelegate.calculateAvg(values)) == 0);
    }
}
