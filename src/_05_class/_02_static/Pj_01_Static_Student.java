package _05_class._02_static;

public class Pj_01_Static_Student {

    //필드 (변수 정리)
        private String name;
        private int student_ID;
        private int grade;
    // 오른쪽 버튼 눌러서 getter setter 만들기

        // 클래스 변수 (static 변수) 총 학생수
        private static int totalStudents = 0;
        // 0으로 초기화



        public Pj_01_Static_Student(String name, int student_ID, int grade) {
            //생성자로 이름 학번 초기화, 토탈 스튜던트 증가시키기
            this.name = name;
            this.student_ID = student_ID;
            this.grade = grade;
            totalStudents++;
        }


        // getter, setter 존
        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStudent_ID() {
            return this.student_ID;
        }

        public void setStudent_ID(int student_ID) {
            this.student_ID = student_ID;
        }

        public int getGrade() {
            return this.grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }




        // displayInfo 메서드 정리
        public void displayInfo() {
            System.out.println("=== 학생 정보 ===");
            System.out.println("이름: " + this.name);
            System.out.println("학번: " + this.student_ID);
            System.out.println("학년: " + this.grade);
            System.out.println();
        }

        // 클래스 변수 getter
        public static int getTotalStudents() {
            return totalStudents;
        }
    }

