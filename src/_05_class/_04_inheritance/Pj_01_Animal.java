package _05_class._04_inheritance;

public class Pj_01_Animal {
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String species;
    private String name;
    private int age;

    public void makeSound(String name) {
        System.out.println(name + "동물은 소리를 낸다");
    }


}
