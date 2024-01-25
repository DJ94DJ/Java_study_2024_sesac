package _05_class._04_inheritance;

public class Pj_01_Cat extends Pj_01_Animal{

    private String chur;

    public Pj_01_Cat(String species, String name, int age) {
        // 부모로부터 상속받은 필드
        setSpecies(species);
        setName(name);
        setAge(age);
    }

    public String getChur() {
        return chur;
    }

    public void setChur(String chur) {
        this.chur = chur;
        System.out.println(chur + "을(를) 제일 좋아함");
    }

     // 어노테이션 생략가능
    public void makeSound() {
        System.out.println("깪앻");
    }

}
