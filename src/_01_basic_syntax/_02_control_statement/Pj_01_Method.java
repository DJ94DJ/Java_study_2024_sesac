package _01_basic_syntax._02_control_statement;

import java.util.Scanner;

public class Pj_01_Method {
    public static void main(String[] args) {
        System.out.println("숫자 두 개를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        double firstNum = scanner.nextInt();
        double secondNum = scanner.nextInt();

        System.out.println( "덧셈 결과 : " + add(firstNum, secondNum));
        System.out.println( "뺄셈 결과 : " + min(firstNum, secondNum));
        System.out.println( "나눗셈 결과 : " + div(firstNum, secondNum));
        System.out.println( "곱셈 결과 : " + mul(firstNum, secondNum));
        scanner.close(); // scanner 닫기


    }
    public static double add(double a, double b) { return a + b; }
    public static double min(double a, double b) { return a - b; }
    public static double div(double a, double b) { return a / b; }
    public static double mul(double a, double b) { return a * b; }
}
