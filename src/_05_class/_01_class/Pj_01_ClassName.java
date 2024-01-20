package _05_class._01_class;

import java.util.Scanner;

public class Pj_01_ClassName {
    // 필드 (변수)

    public int width;
    public int height;

    // 메소드 (함수)
    // 생성자 -> 클래스 명과 동일한 이름
    public Pj_01_ClassName() {
    }

    public void areaMethod() {
        System.out.println(width + " * " +  height + " = " + (width * height));
    }

    public static void main(String[] args) {
        Pj_01_ClassName area = new Pj_01_ClassName();

        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");

        area.width = Integer.parseInt(inputs[0]);
        area.height = Integer.parseInt(inputs[1]);

        //필드, 메소드 사용

        System.out.print("사각형의 넓이는 "); area.areaMethod();

        scanner.close();
    }
}