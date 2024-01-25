package _05_class._04_inheritance;

public class Pj_02_Motorcycle extends Pj_02_Vehicle{

    private String licenseType;

    public String getLicenseType() {
        return licenseType;
    }
    public void setLicenseType(String licenseType) {
        this.licenseType = "A";
    }

    public Pj_02_Motorcycle(String brand, String model, int year, String header) {
        // 부모로부터 상속받은 필드
        setBrand(brand);
        setModel(model);
        setYear(year);
        setHeader(header);
    }


    public void working(){
        System.out.println("부릉부릉 거립니다.");
    }
    public void info(String header, String brand, String model,  int year,  String licenseType) {

        System.out.println( "{"+ header + " " + "{brand = " + brand + ", model = " + model + ", year = " + year + ", licenseType = " + licenseType + "}");
    }


}
