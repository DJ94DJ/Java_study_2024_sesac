package _05_class._01_class;

public class Person {
    // 소문자 person과 충돌해서 안되었음.
    // 필드 (private)
    private int age;
    private String name;

    public String getName() {
        return name;
    }
    //    getter : 우클릭 generate getter/ setter로 자동 생성 가능
    // 반환하는 것이 유일한 기능
    // 우클릭 - generate > getter setter 생성 가능
    public int getAge(){ return age; }

    //    setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }


    public static void main(String[] args) {
        Person codie = new Person();
        codie.age = 10; // 권장 X
        codie.setName("codie"); // 권장 O

        // 출력시에도 getter와 setter을 이용하는걸 권장함
        // System.out.println(codie.age); // 권장 X
        System.out.println(codie.getAge()); // 권장 O
    }
}
