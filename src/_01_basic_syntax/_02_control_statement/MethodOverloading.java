package _01_basic_syntax._02_control_statement;

// 오버로딩
// - 하나의 클래스에서 동일한 이름의 메서드 여러 개 정의
// 즉, 이름이 같고 매개변수 타입, 개수, 순서가 다름
// - 동작이 유사할 때 사용하면 편리

public class MethodOverloading {
    public static void main(String[] args) {
        // 1. 객체 생성
        MethodOverloading ol = new MethodOverloading();

        // 2. 객체의 메서드 사용
        System.out.println(ol.add(1,2));
        System.out.println(ol.add(1.1,2.2));
        // 부동 소수점의 한계
        // BigDecimal : 정확한 계산이 필요하다면 클래스를 이용해서 계산을 해야한다.
        System.out.println(ol.add(1.1,2.2, 3.3));

        System.out.println(ol.add(1,2, 3));
    }

    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
    public int add(int a, int b, int c) { return a + b + c; }
    public double add(double a, double b, double c) { return a + b + c; }




}
