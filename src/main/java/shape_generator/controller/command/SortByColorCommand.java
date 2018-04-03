package shape_generator.controller.command;

import shape_generator.model.ShapeManager;
import shape_generator.model.entity.Shape;
import shape_generator.view.ConsoleView;
import shape_generator.view.partial_view.ActionMessagePartialView;
import java.util.Comparator;

public class SortByColorCommand implements ShapeCommand {
    private ConsoleView view;
    private ShapeManager model;
    private static final String RESULT_MSG = "Sort result:";

    public SortByColorCommand(ConsoleView view, ShapeManager model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void execute() {
        view.printResult(new ActionMessagePartialView(RESULT_MSG), model.sort(new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return s1.getShapeColor().compareTo(s2.getShapeColor());
            }
        }));
    }
}
