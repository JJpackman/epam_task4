package subtask2.model.entity;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("%s with radius %.2f", super.toString(), radius);
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
