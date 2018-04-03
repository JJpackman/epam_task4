package shape_generator.utils.data;

import shape_generator.model.entity.Shape;
import shape_generator.utils.data.factories.RandomShapesGenerator;

public class ShapesDataSource {
   private static final int DEFAULT_COUNT = 10;

    public static Shape[] readShapes() {
        return RandomShapesGenerator.createShapeArray(DEFAULT_COUNT);
    }
    public static Shape[] readShapes(int count) {
        return RandomShapesGenerator.createShapeArray(count);
    }
}
