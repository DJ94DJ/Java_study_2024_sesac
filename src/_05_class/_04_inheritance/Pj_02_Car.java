package _05_class._04_inheritance;

public class Pj_02_Car extends Pj_02_Vehicle{

    private boolean convertible;

    public boolean getConvertible() {
        return convertible;
    }
    public void setConvertible(boolean convertible) {
        this.convertible = true;
    }

    public Pj_02_Car(String brand, String model, int year, String header) {
        // 부모로부터 상속받은 필드
        setBrand(brand);
        setModel(model);
        setYear(year);
        setHeader(header);
    }


    public void working(){
        System.out.println("주차했습니다.");
    }
    public void info(String header, String brand, String model,  int year,  boolean convertible) {

        System.out.println( "{"+ header + " " + "{brand = " + brand + ", model = " + model + ", year = " + year + ", convertible = " + convertible + "}");
    }


}
