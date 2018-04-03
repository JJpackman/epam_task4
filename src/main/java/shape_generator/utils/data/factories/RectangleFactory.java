package shape_generator.utils.data.factories;

import shape_generator.model.entity.*;
import static shape_generator.utils.data.factories.RandomShapesGenerator.*;

public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new Rectangle(getRandomValue(), getRandomValue(), getRandomColor());
    }
}
