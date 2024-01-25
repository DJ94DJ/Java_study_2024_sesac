package _05_class._04_inheritance;

public class Pj_01_AnimalEx {
    public static void main(String[] args) {
        Pj_01_Cat StreetCat = new Pj_01_Cat("코리안숏헤어", "나비", 3);

        System.out.println(StreetCat.getSpecies());
        System.out.println(StreetCat.getName());
        System.out.println(StreetCat.getAge());
        StreetCat.setChur("참치맛 츄르");
        System.out.println(StreetCat.getChur());
        StreetCat.makeSound();
        Pj_01_Dog ShibaDog = new Pj_01_Dog("시바이누", "쫑쫑이", 6);

        System.out.println(ShibaDog.getSpecies());
        System.out.println(ShibaDog.getName());
        System.out.println(ShibaDog.getAge());
        ShibaDog.setBall("빨간 공");
        System.out.println(ShibaDog.getBall());
        ShibaDog.makeSound();
    }
}
