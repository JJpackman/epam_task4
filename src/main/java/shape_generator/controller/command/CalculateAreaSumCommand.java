package shape_generator.controller.command;

import shape_generator.model.ShapeManager;
import shape_generator.view.ConsoleView;
import shape_generator.view.partial_view.ActionMessagePartialView;

public class CalculateAreaSumCommand implements ShapeCommand {
    private ConsoleView view;
    private ShapeManager model;
    private static final String RESULT_MSG = "Sum of shapes' area is:";

    public CalculateAreaSumCommand(ConsoleView view, ShapeManager model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void execute() {
        view.printResult(new ActionMessagePartialView(String.format("%s %.2f", RESULT_MSG, model.calcAreaSum())));
    }
}
