package subtask2;

import subtask2.controller.ShapeController;
import subtask2.model.ShapeManager;
import subtask2.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        new ShapeController(new ShapeManager(), new ConsoleView()).run();
    }
}
