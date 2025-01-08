package com.example.calculator2;

import java.util.ArrayList;
import java.util.List;


// 계산을 수행하는 클래스
public class calculator2 {
    private static List<Double> results = new ArrayList<>(); // 계산 결과를 저장하는 컬렉션 필드

    // 계산 수행 메서드
    public static double calculate(double num1, double num2, String operator) {
        double result = 0;
        
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다.");
        }

        addResult(result);
        return result;
    }

    private static void addResult(double result) {
        results.add(result);
    }

    public static List<Double> getResults() {
        return results;
    }

    public static void clearResults() {
        results.clear();
    }
}
