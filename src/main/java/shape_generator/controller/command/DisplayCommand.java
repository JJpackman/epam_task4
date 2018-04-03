package shape_generator.controller.command;

import shape_generator.model.ShapeManager;
import shape_generator.view.ConsoleView;
import shape_generator.view.partial_view.ActionMessagePartialView;

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
