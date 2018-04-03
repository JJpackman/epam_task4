package subtask2.controller.command;

import subtask2.model.ShapeManager;
import subtask2.view.ConsoleView;
import subtask2.view.partial_view.ActionMessagePartialView;

public class DisplayCommand implements ShapeCommand {
    private ConsoleView view;
    private ShapeManager model;
    private static final String MSG = "Existing shapes:";

    public DisplayCommand(ConsoleView view, ShapeManager model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void execute() {
        view.printResult(new ActionMessagePartialView(MSG),  model.getShapes());
    }
}
