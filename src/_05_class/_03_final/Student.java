package _05_class._03_final;

public class Student
{ final String campus = "용산";
    final String sid; // 생성자에서 초기화

    public Student(String sid) {
        this.sid = sid;
    }

    public static void main(String[] args) {
        Student std1 = new Student ( "s001");
        System.out.println(std1.campus);
        System.out.println(std1.sid);

        // final 필드 값은 변경 불가능
        // std1.campus = "영등포"; // 에러남
    }
}
