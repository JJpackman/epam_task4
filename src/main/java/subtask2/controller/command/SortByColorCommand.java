package subtask2.controller.command;

import subtask2.model.ShapeManager;
import subtask2.model.entity.Shape;
import subtask2.view.ConsoleView;
import subtask2.view.partial_view.ActionMessagePartialView;
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
