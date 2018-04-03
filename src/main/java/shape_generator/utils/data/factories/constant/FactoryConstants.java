package shape_generator.utils.data.factories.constant;

import shape_generator.model.entity.enums.ShapeName;
import shape_generator.utils.data.enums.ShapeColors;

import java.util.Random;

public interface FactoryConstants {
    double MIN = 4.5;
    double MAX = 17.45;
    ShapeColors[] COLORS = ShapeColors.values();
    ShapeName[] sNames = ShapeName.values();
    Random random = new Random();
}
