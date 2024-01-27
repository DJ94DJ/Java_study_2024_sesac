package _05_class._09_collection._list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        // Arraylist 컬렉션 객체 생성
        List<String> list1 = new ArrayList<>();

        // LinkedList 컬렉션 객체 생성
        List<String> list2 = new LinkedList<>();

        // 시작, 끝 변수 선언
        long startTime;
        long endTime;

        // ArrayList의 0번 인텍스에 데이터 추가 (10000회  반복)
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));

        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 소용 시간: " + (endTime - startTime));

        // LinkedList의 0번 인텍스에 데이터 추가 (10000회  반복)
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));

        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 소용 시간: " + (endTime - startTime));

//        ArrayList 소용 시간: 5646500
//        LinkedList 소용 시간: 700400 이게 더 시간이 좀더 빠르다.
        // 해석
        // = LinkedList가 요소 추가에 대해 더 빠른 성능을 냄
        // = ArrayList는 0번 인덱스에 새로운 요소를 추가하면서, 기존 요소 인덱스를 한칸씩 뒤로 미는 작업을 하기 때문.



    }
}
