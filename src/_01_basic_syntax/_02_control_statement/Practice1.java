package _01_basic_syntax._02_control_statement;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        System.out.print("나이를 입력하세요 : ");
////        int age = sc.nextInt();
////
////        if (1 <= age && age <= 7) {
////            System.out.println("유아");
////        } else if (8 <= age && age <= 13) {
////            System.out.println("초등학생");
////        } else if (14 <= age && age <= 16) {
////            System.out.println("중학생");
////        } else if (17 <= age && age <= 19) {
////            System.out.println("고등학생");
////        } else if (20 <= age) {
////            System.out.println("성인");
////        }
////
////        sc.close();

        // 실습 2번
        Scanner sc = new Scanner(System.in);
        System.out.print("이름를 입력하세요 : ");
        String name = sc.next();

        if (name.equals("홍길동")) {
            System.out.println("남자");
        } else if (name.equals("성춘향")) {
            System.out.println("여자");
        } else {
            System.out.println("모르겠어요~");
        }

        sc.close();
    }
}
