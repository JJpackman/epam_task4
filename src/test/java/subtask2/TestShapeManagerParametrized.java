package subtask2;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import subtask2.model.ShapeManager;
import subtask2.model.entity.Shape;
import subtask2.model.entity.enums.ShapeName;

import java.util.*;

import static subtask2.utils.data.factories.RandomShapesGenerator.SHAPE_FACTORIES;

@RunWith(value = Parameterized.class)
public class TestShapeManagerParametrized {
    private ShapeName name;
    private Shape shape;
    private ShapeManager shapeManager;
    private final static List<Shape> SHAPES = new ArrayList<>();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { ShapeName.CIRCLE, SHAPE_FACTORIES.get(ShapeName.CIRCLE).create() },
                { ShapeName.RECTANGLE, SHAPE_FACTORIES.get(ShapeName.RECTANGLE).create() },
                { ShapeName.TRIANGLE, SHAPE_FACTORIES.get(ShapeName.TRIANGLE).create() }
        });
    }

    public TestShapeManagerParametrized(ShapeName name, Shape shape) {
        this.name = name;
        this.shape = shape;
        if (!SHAPES.contains(shape)) {
            SHAPES.add(shape);
        }
    }

    @Before
    public void fillShapeManager() {
        this.shapeManager = new ShapeManager();
        shapeManager.fill(SHAPES.toArray(new Shape[0]));
    }

    @Test
    public void testCalcAreaSum() {
        Assert.assertEquals(shape.calcArea(), shapeManager.calcAreaSum(name), 0.01);
    }

    @Test
    public void testCalcAreaSumAll() {
        double areaSum = 0.0;

        for (Shape s : shapeManager.getShapes()) {
            areaSum += s.calcArea();
        }

        Assert.assertEquals(areaSum, shapeManager.calcAreaSum(), 1);
    }

    @Test
    public void testSort() {
        final Comparator<Shape> byArea = new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return (int) (o1.calcArea() - o2.calcArea());
            }
        };

        if (SHAPES.size() > 1) {
            Assert.assertNotEquals(SHAPES.toArray(), shapeManager.sort(byArea));
        } else {
            Assert.assertArrayEquals(SHAPES.toArray(), shapeManager.sort(byArea));
        }
    }
}
