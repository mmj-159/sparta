package com.example.calculator2;

import java.util.Objects;

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


        //        if (Objects.equals(sign,"+")) {
//            result = firstNum + secondNum;
//        } else if (Objects.equals(sign,"-")) {
//            result = firstNum - secondNum;
//        } else if (Objects.equals(sign,"*")) {
//            result = firstNum * secondNum;
//        } else if (Objects.equals(sign,"/")) {
//            if (secondNum == 0) {
//                System.out.println("0으로 나눌 수 없습니다.");
//            } else {
//                result = (double) firstNum / secondNum;
//            }
//        } else {
//            System.out.println("+-*/중에 입력하세요.");
//        }

        return result;

    }
}
