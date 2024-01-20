package _05_class._01_class;

import java.util.ArrayList;
import java.util.Scanner;

public class Pj_01_Rectangle_ {
    // 필드 (변수)
    private int width;
    private int height;

    //getter
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    //setter
    public void setWidth(int width) {this.width = width; }
    public void setHeight(int height) {this.height = height; }

    //넓이를 계산하는 메서드
    public int getArea() {
        return width * height;
    }


    public static void main(String[] args) {
        // ArrayList를 판다.
        ArrayList<Pj_01_Rectangle_> rectangles = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요 (모두 0을 입력하면 종료):");
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            if (width == 0 && height == 0) {
                break;
            }

            Pj_01_Rectangle_ rectangle = new Pj_01_Rectangle_();
            rectangle.setWidth(width);
            rectangle.setHeight(height);
            rectangles.add(rectangle);
        }

        for (Pj_01_Rectangle_ rectangle : rectangles) {
            // : <<  rectangles 리스트의 첫 번째 요소부터 마지막 요소까지 차례로 rectangle 변수에 할당하며 블록 내의 코드를 실행하는 것을 의미합니다.
            System.out.println("가로길이: " + rectangle.getWidth() + ", 세로길이: " + rectangle.getHeight() + ", 넓이: " + rectangle.getArea());
            System.out.println("-------------------------------------------");
        }

        scanner.close();
    }
}