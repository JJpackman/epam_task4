package shape_generator_tests;

import org.junit.*;
import shape_generator.model.ShapeManager;
import shape_generator.model.entity.Shape;
import shape_generator.model.entity.enums.ShapeName;

import java.util.Comparator;

public class TestShapeManagerWithNoData {
    private static ShapeManager shapeManager;

    @BeforeClass
    public static void createShapeManager() {
        shapeManager = new ShapeManager();
        shapeManager.fill();
    }

    @Test
    public void testCalcAreaSum() {
        Assert.assertEquals(0, shapeManager.calcAreaSum(), 1);
    }

    @Test
    public void testCalcCircleAreaSum() {
        Assert.assertEquals(0, shapeManager.calcAreaSum(ShapeName.CIRCLE), 1);
    }

    @Test
    public void testCalcRectangleAreaSum() {
        Assert.assertEquals(0, shapeManager.calcAreaSum(ShapeName.RECTANGLE), 1);
    }

    @Test
    public void testCalcTriangleAreaSum() {
        Assert.assertEquals(0, shapeManager.calcAreaSum(ShapeName.TRIANGLE), 1);
    }

    @Test
    public void testIsShapeManagerEmpty() {
        Assert.assertEquals(0, shapeManager.getShapes().length);
    }

    @Test
    public void testSort() {
        Shape[] sortedShapes = shapeManager.sort(new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return (int) (s1.calcArea() - s2.calcArea());
            }
        });

        Assert.assertEquals(0, sortedShapes.length);
    }
}
