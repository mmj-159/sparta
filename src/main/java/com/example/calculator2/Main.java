package com.example.calculator2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n1. 계산 수행");
            System.out.println("2. 모든 결과 보기");
            System.out.println("3. 모든 결과 지우기");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            if (choice == 1){
                System.out.println("첫번째 숫자 입력 (문자를 입력시 오류발생):");
                int firstNum = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                String sign = sc.next();

                System.out.print("두번째 숫자 입력 (문자를 입력시 오류발생):");
                int secondNum = sc.nextInt();

                double result = calculator2.calculate(firstNum, secondNum, sign);
                System.out.println("계산 결과: " + result);
            }else if (choice == 2){
                System.out.println("현재까지의 모든 결과: " + calculator2.getResults());
            }else if (choice == 3){
                calculator2.clearResults();
                System.out.println("현재까지의 모든 결과를 삭제합니다. ");
            }else if (choice == 4){
                System.out.println("프로그램이 종료됩니다");
                break;
            }else {
                System.out.println("유효하지 않은 선택입니다. 다시 시도하세요.");
            }
        }
    }
}
