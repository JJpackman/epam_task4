package subtask2.model.entity;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b, String shapeColor) {
        super(shapeColor);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double calcArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return String.format("%s with sides a: %.2f, b: %.2f", super.toString(), a, b);
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
