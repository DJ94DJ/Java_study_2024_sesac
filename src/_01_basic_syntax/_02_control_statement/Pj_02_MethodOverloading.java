package _01_basic_syntax._02_control_statement;

import java.util.Scanner;

public class Pj_02_MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading ol = new MethodOverloading();

        System.out.println("계산할 도형의 종류를 선택하세요. (1: 원, 2: 직사각형, 3: 삼각형)");
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("계산할 도형의 종류를 선택하세요. (1: 원, 2: 직사각형, 3: 삼각형, 0: 종료)");
            option = scanner.nextInt();

            double firstNum, secondNum;
            switch (option) {
                case 1:
                    System.out.println("원의 반지름을 입력하세요.");
                    firstNum = scanner.nextDouble();
                    System.out.println("반지름이 " + firstNum + "인 원의 넓이 : " + ol.add(firstNum));
                    break;
                case 2:
                    System.out.println("직사각형의 가로와 세로 길이를 입력하세요.");
                    firstNum = scanner.nextDouble();
                    secondNum = scanner.nextDouble();
                    System.out.println("가로 " + firstNum + ", 세로 " + secondNum + "인 직사각형의 넓이 :" + ol.add(firstNum, secondNum));
                    break;
                case 3:
                    System.out.println("삼각형의 밑변과 높이를 입력하세요.");
                    firstNum = scanner.nextDouble();
                    secondNum = scanner.nextDouble();
                    System.out.println("밑변 " + firstNum + ", 높이 " + secondNum + "인 삼각형의 넓이 :" + ol.add(firstNum, secondNum, true));
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        } while (option != 0);

        scanner.close(); // scanner 닫기
    }

    static class MethodOverloading {
        public double add(double a) { return a * a * 3.14159; }
        public double add(double a, double b) { return a * b; }
        public double add(double a, double b, boolean isTriangle) { return isTriangle ? a * b / 2 : a * b; }
    }
}
