package _05_class._04_inheritance;

public class Pj_01_Dog extends Pj_01_Animal {
    private String ball;

    public Pj_01_Dog(String species, String name, int age) {
        // 부모로부터 상속받은 필드
        setSpecies(species);
        setName(name);
        setAge(age);
    }

    public String getBall() {
        return ball;
    }

    public void setBall(String ball) {
        this.ball = ball;
        System.out.println(ball + "을(를) 던져 주세요!");
    }

    // 어노테이션 생략가능
    public void makeSound() {
        System.out.println("헥헥");
    }
}
