package _03_array;

//Collection Framework
// : 객체를 효율적으로 추가, 삭제, 검색할 수 있도록 관련 인터페이스 & 클래스를 java.util에 포함시켜 놓음

// List
// ㄴ ArrayList

// Set
// ㄴ HashSet
// ㄴ TreSet

// Map
// ㄴ HashMap
// ㄴ HashTable
// ㄴ TreeMap

// ArrayList 클래스
// - List 컬렉션에서 가장 많이 사용하는 컬렉션
// - 표준 배열보단 조금 느릴 수 있다. 배열에서 많은 조작 필요시 유용하게 사용가능.
// - 크기를 미리 지정하지 않아도 됨. (비동적인 배열과 달리 동적 할당됨)
// - List 컬렉션은 객체 자체를 저장하는 게 아니라, 객체 번지를 저장 => 동일한 객체는 중복 저장할 수도 있는데,
// 동일한 번지수가 저장되었는 뜻- null도 가능하다.

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {



    public static void main(String[] args) {
        // 1. ArrayList 생성 (정수형)
        // 1. ArrayList 생성 (정수형)
        ArrayList<Integer> numbers = new ArrayList<>();

        // 2. 요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        // 3. 요소 접근
        System.out.println("첫번째 요소 : " + numbers.get(0));

        // 4. 요소 수정
        numbers.set(1, 77);
        System.out.println("numbers : " + numbers); // [10, 77, 30, 40, 50]

        // 5. 요소 삽입 (지정된 위치)
        numbers.add(1, 7);
        System.out.println("numbers :" + numbers); // [10, 7, 77, 30, 40, 501

        // 6. ArrayList 끼리 연결
        System.out.println(Arrays.asList(99, 33, 55));
        numbers.addAll(Arrays.asList(99, 33, 55));
        System.out.println("numbers :" + numbers);

        // 7. 요소 위치 찾기
        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.indexOf(30));
        System.out.println(numbers.indexOf(99));

        // 8. 요소 삭제
        numbers.remove(2);
        System.out.println("numbers :" + numbers);

        //9. 리스트 크기 확인
        System.out.println("리스트 크기 : " + numbers.size());

        //10. 모든 요소 출력
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }

        //11. 모든 요소 삭제
        System.out.println();
        numbers.clear();
        System.out.println("numbers : " + numbers);


        ///////////////////////////////////////////////
        // Student 타입의 ArrayList 생성
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John", 10));

        Student std1 = new Student("Jennie", 14);
        students.add(std1);
        students.add(new Student ( "Lisa", 21));
        students.add(new Student ( "Lily", 13));
        students.add(new Student ("Rose", 18));

        System.out.println("students : " + students);
        System.out.println("학생 수 : " + students.size());

        Student std = students.get(0);
        System.out.println(std.getName() + " 학생의 나이는 " + std.getAge() + "세 입니다!");

        // 반복문 이용
        System.out.println("=== 학생 명단 ===");
        for (Student student : students) {
            System.out.println(student.getName() + "(" + student.getAge() + ")");
        }

        //System.out.println (Arrays.toString(array));
        System.out.println(Arrays.toString(students.toArray()));







    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
}