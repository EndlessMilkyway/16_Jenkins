package com.endlessmilkyway.jenkins.dto;

public class CalculatorDTO {

    // Response와 Request를 둘 다 처리하는 DTO
    private int num1;
    private int num2;
    private int sum;

    public CalculatorDTO() {
    }

    public CalculatorDTO(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public CalculatorDTO(int num1, int num2, int sum) {
        this.num1 = num1;
        this.num2 = num2;
        this.sum = sum;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "CalculatorDTO{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", sum=" + sum +
                '}';
    }
}
