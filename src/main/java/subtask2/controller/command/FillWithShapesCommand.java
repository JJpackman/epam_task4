package subtask2.controller.command;

import subtask2.model.ShapeManager;
import subtask2.utils.data.ShapesDataSource;
import subtask2.view.ConsoleView;
import subtask2.view.partial_view.ActionMessagePartialView;

public class FillWithShapesCommand implements ShapeCommand {
    private ConsoleView view;
    private ShapeManager model;
    private static final String RESULT_MSG = "Shapes created";

    public FillWithShapesCommand(ConsoleView view, ShapeManager model) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void execute() {
        model.fill(ShapesDataSource.readShapes());
        view.printResult(new ActionMessagePartialView(RESULT_MSG), model.getShapes());
    }
}
