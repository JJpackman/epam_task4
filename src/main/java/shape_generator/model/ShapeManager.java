package shape_generator.model;

import shape_generator.model.entity.*;
import shape_generator.model.entity.enums.ShapeName;
import java.util.*;

public class ShapeManager {
    private Shape[] shapes;

    public void fill(Shape... shapes) {
        this.shapes = shapes != null ? shapes : new Shape[0];
    }

    public double calcAreaSum() {
        double res = 0.0;

        for (Shape s : shapes) {
            res += s.calcArea();
        }

        return res;
    }

    public Shape[] getShapes() {
        return shapes;
    }

    private double calcCircleAreaSum() {
        double res = 0.0;

        for (Shape s: shapes) {
            res = s instanceof Circle ? s.calcArea() : res;
        }

        return res;
    }

    private double calcRectangleAreaSum() {
        double res = 0.0;

        for (Shape s: shapes) {
            res = s instanceof Rectangle ? s.calcArea() : res;
        }

        return res;
    }

    private double calcTriangleAreaSum() {
        double res = 0.0;

        for (Shape s: shapes) {
            res = s instanceof Triangle ? s.calcArea() : res;
        }

        return res;
    }

    public double calcAreaSum(ShapeName shape) {
        double res = 0.0;

        switch (shape) {
            case CIRCLE:
                res = calcCircleAreaSum();
                break;
            case RECTANGLE:
                res = calcRectangleAreaSum();
                break;
            case TRIANGLE:
                res = calcTriangleAreaSum();
                break;
        }

        return res;
    }

    public Shape[] sort(Comparator<Shape> c) {
        Shape[] shapesCopy = new Shape[shapes.length];

        System.arraycopy(shapes, 0, shapesCopy, 0, shapesCopy.length);
        Arrays.sort(shapesCopy, c);

        return shapesCopy;
    }
}
