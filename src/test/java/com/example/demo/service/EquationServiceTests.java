package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.assertj.core.api.Assertions;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@SpringBootTest
public class  EquationServiceTests {


   @Autowired
   private EquationService equationService;

@Test
void testSum(){
    double a = 5;
    double b = 10;

    assertEquals(15,equationService.getSum(a,b));
    assertThat(equationService.getSum(a,b), is(equalTo(Double.valueOf(15))));

}

@Test
void testGetResult(){
    double a = 4;
    double b= 1;
    assertThat(equationService.getResult(a,b,"A"), is(equalTo(Double.valueOf(5))));

}

}
