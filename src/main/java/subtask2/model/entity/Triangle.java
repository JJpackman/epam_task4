package subtask2.model.entity;

public class Triangle extends Shape {
    private double side;
    private double height;

    public Triangle(double side, double height, String shapeColor) {
        super(shapeColor);
        this.side = side;
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calcArea() {
        return 1 / 2 * (side * height);
    }

    @Override
    public String toString() {
        return String.format("%s with side: %.2f and height: %.2f", super.toString(), side, height);
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
