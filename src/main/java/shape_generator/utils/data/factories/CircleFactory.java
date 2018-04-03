package shape_generator.utils.data.factories;

import shape_generator.model.entity.*;
import static shape_generator.utils.data.factories.RandomShapesGenerator.*;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new Circle(getRandomColor(), getRandomValue());
    }
}
