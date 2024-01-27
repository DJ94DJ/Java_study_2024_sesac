package _05_class._09_collection.Pj_02;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pj_02 {

    public static void main(String[] args) {
        Map<String, Integer> nameAgeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다."
        );

        while (true) {
            System.out.print("이름 입력: ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                break;
            }

            System.out.print("나이 입력: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            nameAgeMap.put(name, age);
        }

        System.out.println("\n== 입력 받은 이름과 나이 목록 ==");

        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            System.out.println(
                    "이름: " + entry.getKey() + ", 나이: " + entry.getValue()
            );
        }

        scanner.close();
    }
}