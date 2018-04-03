package shape_generator.controller.command;

import shape_generator.model.ShapeManager;
import shape_generator.utils.data.ShapesDataSource;
import shape_generator.view.ConsoleView;
import shape_generator.view.partial_view.ActionMessagePartialView;

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
