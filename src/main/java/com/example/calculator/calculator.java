package com.example.calculator;

import java.util.Objects;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("첫번째 숫자 입력 (문자를 입력시 오류발생):");
            int firstNum = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");

            String sign = sc.next();

            System.out.print("두번째 숫자 입력 (문자를 입력시 오류발생):");
            int secondNum = sc.nextInt();

            int finalNum;

            if (Objects.equals(sign, "+")) {
                finalNum = firstNum + secondNum;
                System.out.println("결과 : " + finalNum);
            } else if (Objects.equals(sign, "-")) {
                finalNum = firstNum - secondNum;
                System.out.println("결과 : " + finalNum);
            } else if (Objects.equals(sign, "*")) {
                finalNum = firstNum * secondNum;
                System.out.println("결과 : " + finalNum);
            } else if (Objects.equals(sign, "/")) {
                if (secondNum == 0){
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    finalNum = firstNum / secondNum;
                    System.out.println("결과 : " + finalNum);
                }
            } else{
                System.out.println("+-*/중에 입력하세요.");
            }
            System.out.println("계속하시겠습니까?(NO를 입력하면 프로그램이 종료됩니다.) :");

            if (Objects.equals(sc.next(), "no") || Objects.equals(sc.next(), "No")|| Objects.equals(sc.next(), "NO")) {
                System.out.println("프로그램 종료.");
                break;
            }
        }
    }
}
