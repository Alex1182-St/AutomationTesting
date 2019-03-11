package Lesson3.A1_Methods;

public class IntsDivision {

    private int a, b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public IntsDivision() {
    }

    public double divisionMethod() {

        double c;
        c = a /(double) b;
        return c;

}}
