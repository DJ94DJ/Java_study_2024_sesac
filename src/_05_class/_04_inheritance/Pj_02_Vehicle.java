package _05_class._04_inheritance;

public class Pj_02_Vehicle {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private String brand;
    private String model;
    private int year;


    private String header;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
        System.out.println("===" + header + "정보" + "===");
    }

    public void info(String header, String brand, String model,  int year) {
        this.header = header;
        this.brand = brand;
        this.model = model;
        this.year = year;
        System.out.println( "{"+ header + " " + "brand = " + brand + ", model = " + model + ", year = " + year + "}");
    }

    public void startEngine(String header) {
        System.out.println(header + "의 시동을 걸었습니다.");
    }

    public void working(String header) {
        System.out.println(header + "은 잘 작동하고 있습니다.");
    }

    public void rest(String header)  {
        System.out.println(header + "의 시동을 정상적으로 정지했습니다.");
    }



}
