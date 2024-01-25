package _05_class._06_1_Pj;

public class OnRoad {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];


        Car car = new Car();
        car.setName("My Car");
        car.setMaxSpeed(150);
        vehicles[0] = car;

        Airplane airplane = new Airplane();
        airplane.setName("My Airplane");
        airplane.setMaxSpeed(900);
        vehicles[1] = airplane;

        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName() + "의 최대 속도는 " + vehicle.getMaxSpeed() + "입니다.");
            vehicle.move();
            if (vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly(); //
            }
        }

    }
}
