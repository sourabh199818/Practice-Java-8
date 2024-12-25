package org.example;

import org.example.coding.FibonacciSeries;
import org.example.exceptionHandling.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ExceptionHandling exceptionHandling = new  ExceptionHandling();

//        exceptionHandling.exception();

        FibonacciSeries.fibonacciS();
    }
}