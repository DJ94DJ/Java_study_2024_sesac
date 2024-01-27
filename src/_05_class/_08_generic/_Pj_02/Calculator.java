package _05_class._08_generic._Pj_02;

import _05_class._08_generic._Pj_01.Pair;

public class Calculator<T extends Number> {

    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public T getNum1() {
        return num1;
    }

    public T getNum2() {
        return num2;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }

    public static void main(String[] args) {
        Calculator<Integer> Calculator1 = new Calculator<>(15, 33);
        Calculator<Double> Calculator2 = new Calculator<>(15.99, 33.085);

        System.out.println("Integer Sum:" + Calculator1.add());
        System.out.println("Double Sum:" + Calculator2.add());
    }


}
