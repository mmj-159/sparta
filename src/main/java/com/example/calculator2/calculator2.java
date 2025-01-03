package com.example.calculator2;

import java.util.Objects;

public class calculator2 {
    private double result;

    public double calculate2(String sign, int firstNum, int secondNum) {
        if (Objects.equals(sign,"+")) {
            result = firstNum + secondNum;
            System.out.println("결과 : " + result);
        } else if (Objects.equals(sign,"-")) {
            result = firstNum - secondNum;
            System.out.println("결과 : " + result);
        } else if (Objects.equals(sign,"*")) {
            result = firstNum * secondNum;
            System.out.println("결과 : " + result);
        } else if (Objects.equals(sign,"/")) {
            if (secondNum == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                result = (double) firstNum / secondNum;
                System.out.println("결과 : " + result);
            }
        } else {
            System.out.println("+-*/중에 입력하세요.");
        }

        return result;
    }
}
