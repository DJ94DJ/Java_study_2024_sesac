package _05_class._04_inheritance;

public class Pj_02_VehicleEx {
    public static void main(String[] args) {
        Pj_02_Bus bus1 = new Pj_02_Bus("Hyundai","City Bus", 2022, "bus");
        bus1.info("Bus","Hyundai","City Bus", 2022, 30);
        bus1.startEngine("Bus");
        bus1.working();
        bus1.rest("Bus");

    }
}
