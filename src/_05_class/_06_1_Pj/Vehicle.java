package _05_class._06_1_Pj;

public abstract class Vehicle {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    String name;
    int maxSpeed;

    abstract void move();

}
