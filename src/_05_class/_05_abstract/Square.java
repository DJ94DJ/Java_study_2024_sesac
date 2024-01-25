package _05_class._05_abstract;

public class Square extends Shape {

    int width;
    int height;


    public Square(String color, String type, int width, int height) {
        super(color, type);
        this. width =  width;
        this. height =  height;
    }


    double calculateArea() {
        return width * height;
    }

    void draw() {
        System.out.println();
        System.out.println( "=== " + type + " 도형의 정보 " + "===" );
    }
}
