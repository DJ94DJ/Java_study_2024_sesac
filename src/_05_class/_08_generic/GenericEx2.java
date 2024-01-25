package _05_class._08_generic;

// 참고 Number 클래스
// Java 의 모든 숫자 형식의 부모 클래스

// 제네릭 제한
// Number 를 상속한 클래스만 허용
class Box<T extends Number> {
    private T item;
    public void setItem(T item) {
        this.item = item;
    }
}

interface Movable {
    void move();
}

class Car implements Movable {
    @Override
    public void move() {
        System.out.println("자동차 출발!");
    }
}

class Container<T extends Movable> {
    private T item;

    public Container(T item) {
        this.item = item;
    }
    public void makeItMove() {
        item.move();
    }
}
public class GenericEx2 {
    public static void main(String[] args) {
        //  Box<String> stringBox = new Box<String>(); number만 들어가기 때문에 오류난다!

        Box<Double> doubleBox = new Box<Double>();  // 그래서 더블로 하면 오류안남 ㅎ

        // Case 2
        Container<Car> carContainer = new Container<>(new Car()); // car의 객채를 넣어준 것

        //
    }
}
