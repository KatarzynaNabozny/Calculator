package com.kate.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
        Calculator calculator = new Calculator();
        System.out.println("Add= " + calculator.add(1, 2));
        System.out.println("Substraction= " + calculator.substraction(1, 2));
    }
}
