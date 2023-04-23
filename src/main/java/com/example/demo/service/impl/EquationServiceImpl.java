package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.EquationService;


@Service
public class EquationServiceImpl implements EquationService{

    @Override
    public double getSum(double a, double b) {
        // TODO Auto-generated method stub
        return a + b;
    }


    @Override
    public double getResult(double a, double b, String equation){
        if(equation.equals("M")){
            return a * b;
        }else if(equation.equals("S")){
            return a - b;

        }else if(equation.equals("D")){
            return a / b;
        }
        else{
            return a+b;
        }
    }



    
    
}
