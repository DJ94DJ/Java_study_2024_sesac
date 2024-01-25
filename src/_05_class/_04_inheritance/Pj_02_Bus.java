package _05_class._04_inheritance;

public class Pj_02_Bus extends Pj_02_Vehicle{

    private int passengerCapacity;

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = 30;
    }

    public Pj_02_Bus(String brand, String model, int year, String header) {
        // 부모로부터 상속받은 필드
        setBrand(brand);
        setModel(model);
        setYear(year);
        setHeader(header);
    }



    public void working(){
        System.out.println("승객을 운송합니다.");
    }

    public void info(String header, String brand, String model,  int year, int passengerCapacity ) {

        System.out.println( "{"+ header + " " + "brand = " + brand + ", model = " + model + ", year = " + year + ", passengerCapacity = " + passengerCapacity + "}");
    }


}
