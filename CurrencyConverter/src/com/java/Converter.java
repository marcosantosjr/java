package com.java;

public class Converter {

    double number;

    public Converter(){}

    public Converter(int number) {

        this.number = number;

    }

    public void realToDolar(){

        this.number *= 0.19;

    }

    public double verifyBalance(){

        return this.number;

    }


}
