package subtask2.controller.command;

import subtask2.model.ShapeManager;
import subtask2.view.ConsoleView;
import subtask2.view.partial_view.ActionMessagePartialView;

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
