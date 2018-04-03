package subtask2.utils.data;

import subtask2.model.entity.Shape;
import subtask2.utils.data.factories.RandomShapesGenerator;

public class ShapesDataSource {
   private static final int DEFAULT_COUNT = 10;

    public static Shape[] readShapes() {
        return RandomShapesGenerator.createShapeArray(DEFAULT_COUNT);
    }
    public static Shape[] readShapes(int count) {
        return RandomShapesGenerator.createShapeArray(count);
    }
}
