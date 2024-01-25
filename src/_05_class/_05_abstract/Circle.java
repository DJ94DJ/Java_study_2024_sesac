package _05_class._05_abstract;

public class Circle extends Shape {

   double radius;

    public Circle(String color, String type, int radius) {
        super(color, type);
        this.radius = radius;
    }

    double calculateArea() {
        return radius * radius * 3.14;
    }


    void draw() {
        System.out.println( "=== " + type + " 도형의 정보 " + "===" );
    }
}
