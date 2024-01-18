package _01_basic_syntax._02_control_statement;

import java.util.Scanner;

public class Pj_02_answer {

    //원 넓이
    public void getArea(int r) {
        System.out.printf("반지를이 %d 인 원의 넓이 : %f", r, r * r * Math.PI).println();
    }

    // 직사각형 넓이
    public void getArea(int x, int y) {
        System.out.printf("가로가 %d, 세로가 %d인 직사각형의 넓이 : %d", x, y, x * y).println();
    }

    // 삼각형 넓이
    public void getArea(int w, int h, boolean isTriangle ) {
        System.out.printf("밑변이 %d, 높이 %d인 삼각형의 넓이 : %f", w, h, w * h * 0.5).println();
    }

    public static void main(String[] args) {
        Pj_02_answer pr = new Pj_02_answer();
        pr.getArea(5);
        pr.getArea(4 , 9);
        pr.getArea(10 , 28, true);
    }
}
