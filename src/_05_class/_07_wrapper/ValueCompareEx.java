package _05_class._07_wrapper;

// 포장 값비교
// - 포장 객체 내부 값을 비교하기 위해 --, != 연산자 불가
// equals() 메소드 사용
// 다만, 특정 범위에 포함되는 값은 포장 객체 공유된다 (같은 참조값)

// 대부분 포장 클래스엔 "parse + 기본타입" 명으로 된 static 메소드 존재 => 기본타입으로 변환시 사용

public class ValueCompareEx {
    public static void main(String[] args) {
        // -128 ~127내 값을 갖는 경우
        Integer obj1= 10;
        Integer obj2= 10;
        System.out.printf("%d == %d : %b%n", obj1, obj2, obj1 == obj2); // true

    }


}
