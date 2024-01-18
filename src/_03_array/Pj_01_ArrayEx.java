package _03_array;

import java.util.Scanner;

public class Pj_01_ArrayEx {
    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int[] intArray = new int[5];

        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            result += intArray[i];
        }

        System.out.println("평균은 : " + (double)result / intArray.length);

    }


}
