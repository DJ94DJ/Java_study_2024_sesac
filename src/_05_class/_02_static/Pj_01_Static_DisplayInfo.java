package _05_class._02_static;

import java.util.ArrayList;
import java.util.Scanner;
public class Pj_01_Static_DisplayInfo {
    public static void main(String[] args) {
        ArrayList<Pj_01_Static_Student> ShowStudents = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생 정보를 입력하세요. (입력 형식: 이름 학번 학년. 종료하려면 'done' 입력)");
        while(true) {
            String name = scanner.nextLine();

            if(name.equalsIgnoreCase("done")) {
                break;
            }

            int student_ID = scanner.nextInt();
            int grade = scanner.nextInt();
            scanner.nextLine(); //

            Pj_01_Static_Student student = new Pj_01_Static_Student(name, student_ID, grade);
            ShowStudents.add(student);
        }

        for(Pj_01_Static_Student student : ShowStudents) {
            student.displayInfo();
        }

        System.out.println("총 학생 수는 " + Pj_01_Static_Student.getTotalStudents() + "명 입니다.");

        scanner.close();


    }
}
