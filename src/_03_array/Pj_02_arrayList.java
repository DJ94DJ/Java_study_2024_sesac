package _03_array;
import java.util.ArrayList;
import java.util.Scanner;

public class Pj_02_arrayList

{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> texts = new ArrayList<>();

        System.out.println("문자를 입력해주세요, 'exit' 작성시 종료");


        while(true) {
            String talk = scanner.nextLine();

            if (talk.equals("exit")) {
                System.out.println("작성한 문자를 출력합니다 ");
                for (int i = 0; i < texts.size(); i++) {

                    System.out.println(texts.get(i));
                }
                break;
            } else {
                texts.add(talk);
            }
        }






    }
}
