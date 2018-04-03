package shape_generator;

import shape_generator.controller.ShapeController;
import shape_generator.model.ShapeManager;
import shape_generator.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        new ShapeController(new ShapeManager(), new ConsoleView()).run();
    }
}
