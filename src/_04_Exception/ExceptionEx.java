package _04_Exception;

//예외
//- 일반 예외 (Exception) : 컴파일러가 예외 처리 코드 여부를 검사하는 예외
//- 실행 예외 (Runtime Exception) : 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외

//=> Java 는 예외가 발생하면 예외 클래스로부터 객체 생성하며, 해당 객체는 예외 처리시 사용됨
// 예외 발생 시 프로그램의 갑작스런 종료를 막고 정상 실행할 수 있도록 처리하는 코드를 예외 처리 코드라고 함
// try -catch - finally 블록으로 처리

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// try 블록에서 작성한 코드가 예외없이 정상실행 -> catch 실행 x. finally 실행 ㅇ
// try 블록에서 작성한 코드에서 예외 발생 -> catch 실행 ㅇ, finally 실행 ㅇ
// 심지어 try 블록과 catch 블록에서 return 블록에서 return 문을 상용해도 finally 는 항상 실행해됨 (finally 생략가능)
public class ExceptionEx
{
    public static String devide(int x, int y) { return x + "/" + y + " = " + (x/y); }
    public static int getLength(String str){
        return str.length();
    }

    public static int getValueByIdx(int[] arr, int idx) {
        return arr[idx];
    }

    public static void main(String[] args) {
        // 1. 예외 발생 코드
//        System.out.println(devide(6,0));

        // 처리
        try {
            System.out.println("*** 연산 시작!");
            System.out.println(devide(6,0));
        } catch (ArithmeticException e) {
            // 방법 1: 예외발생한 이유만 확인
            System.out.println("나누기 중 에러 발생 >> " + e.getMessage());

            // 방법 2: 예외 종류 리턴
            System.out.println("나누기 중 에러 발생 >> " + e.toString());

            // 방법 3 : 예외가 어디서 발생했는지 추적 내용 출력
            e.printStackTrace();
//            java.lang.ArithmeticException: / by zero
//            at _04_Exception.ExceptionEx.devide(ExceptionEx.java:16)
//            at _04_Exception.ExceptionEx.main(ExceptionEx.java:32)

        } finally {
            System.out.println("*** 연상종료");
        }

        ///////////////////////////////////////////
        // case 2. 예외 발생 코드
//        System.out.println("단어 길이 : " + getLength(null));
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
        //	at _04_Exception.ExceptionEx.getLength(ExceptionEx.java:18)
        //	at _04_Exception.ExceptionEx.main(ExceptionEx.java:52)

        // case 2. 처리
        try {
            System.out.println("단어 길이 : " + getLength(null));
        } catch (NullPointerException e) {
            System.out.println("단어 길이 연산중 에러 >> " + e.toString());
        }

        // case 3 · 예외 발생 코드
        int[] numbers = {10,  20,  30, 40,  50};
        System.out.println(getValueByIdx(numbers, numbers.length));
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        try {
            System.out.println(getValueByIdx(numbers, numbers.length));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱싱 중 에러 발생 >>" + e.toString());
        }

        ////////////////////////////////////////////
        // case 4
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("정수를 입력하세요");
            int number = scanner.nextInt();
            System.out.println("입력한 정수 : " + number);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException 발생" +  e.toString());
            // 단어 길이 연산중 에러 >> java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
        }
    }
}
