package _05_class._05_abstract;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Shape> shapeList = new ArrayList<>();
        String userChoice = "";

        while (!userChoice.equals("q")) {
            System.out.println("원과 사각형을 만들어봅시다. 원하시는 도형을 선택해주세요. (원: 1, 사각형: 2, 종료: q)");
            userChoice = scanner.nextLine();


            switch(userChoice) {
                case "1":
                    // Circle 정보 입력받기
                    System.out.println("원의 색상을 입력해주세요:");
                    String circleColor = scanner.nextLine();
                    System.out.println("원의 반지름을 입력해주세요:");
                    int circleRadius = scanner.nextInt();
                    scanner.nextLine();  // 개행 문자 제거
                    // Circle 객체 생성 및 ArrayList에 추가
                    shapeList.add(new Circle(circleColor, "circle", circleRadius));
                    break;
                case "2":
                    // Square 정보 입력받기
                    System.out.println("사각형의 색상을 입력해주세요:");
                    String squareColor = scanner.nextLine();
                    System.out.println("사각형의 너비를 입력해주세요:");
                    int squareWidth = scanner.nextInt();
                    scanner.nextLine();  // 개행 문자 제거
                    System.out.println("사각형의 높이를 입력해주세요:");
                    int squareHeight = scanner.nextInt();
                    scanner.nextLine();  // 개행 문자 제거
                    // Square 객체 생성 및 ArrayList에 추가
                    shapeList.add(new Square(squareColor, "square", squareWidth, squareHeight));
                    break;
            }
        }

        for (Shape shape : shapeList) {
            shape.draw();
            System.out.println("도형의 색상 : " + shape.getColor());
            System.out.println("도형의 넓이 : " + shape.calculateArea());
            System.out.println();
        }

        scanner.close();


//        Circle circle = new Circle("blue", "circle", 13 );
//        Square square = new Square( "yellow", "square", 9, 7);
//
////        circle.start();
//        circle.draw();
//        System.out.println("도형의 색상 : " + circle.getColor());
//        System.out.println("도형의 넓이 : " + circle.calculateArea());
//
//
////        square.start();
//        square.draw();
//        System.out.println("도형의 색상 : " + square.getColor());
//        System.out.println("도형의 넓이 : " + square.calculateArea());
    }
}
