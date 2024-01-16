package _01_basic_syntax._01_basic_syntax; // package 는 본인 폴더 이름에 맞게 설정.

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력하세요 : ");
        String name = sc.next();

        System.out.print("나이 입력하세요 : ");
        int age = sc.nextInt();

        System.out.printf("안녕하세요! %s 님, %d 세 이시네요!", name, age);
    }
}
