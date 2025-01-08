package com.example.calculator2;

public class calculator2 {
    private double result;

    public double calculate2(String sign, int firstNum, int secondNum) {
        switch (sign) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                if (secondNum == 0) {
                    System.out.println("0으로 나눌수 없습니다.");
                    break;
                }
                result = (double) firstNum / secondNum;
                break;
        }
        return result;
    }
}
