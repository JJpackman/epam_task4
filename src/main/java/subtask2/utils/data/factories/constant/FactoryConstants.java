package subtask2.utils.data.factories.constant;

import subtask2.model.entity.enums.ShapeName;
import subtask2.utils.data.enums.ShapeColors;

import java.util.Random;

public interface FactoryConstants {
    double MIN = 4.5;
    double MAX = 17.45;
    ShapeColors[] COLORS = ShapeColors.values();
    ShapeName[] sNames = ShapeName.values();
    Random random = new Random();
}
