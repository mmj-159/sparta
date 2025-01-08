package com.example.calculator2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator2 cal = new calculator2();

        do {
            System.out.println("첫번째 숫자 입력 (문자를 입력시 오류발생):");

            int firstNum = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");

            String sign = sc.next();

            System.out.print("두번째 숫자 입력 (문자를 입력시 오류발생):");
            int secondNum = sc.nextInt();

            System.out.println(cal.calculate2(sign, firstNum,secondNum));
            System.out.println("계속하시겠습니까?(exit를 입력하면 프로그램이 종료됩니다.) :");

        } while (!sc.next().equals("exit"));
        System.out.println("프로그램 종료.");

    }
}
