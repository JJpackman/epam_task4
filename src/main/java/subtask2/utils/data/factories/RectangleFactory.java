package subtask2.utils.data.factories;

import subtask2.model.entity.*;
import static subtask2.utils.data.factories.RandomShapesGenerator.*;

public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new Rectangle(getRandomValue(), getRandomValue(), getRandomColor());
    }
}
