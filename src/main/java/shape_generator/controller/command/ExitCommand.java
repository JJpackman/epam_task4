package shape_generator.controller.command;

import shape_generator.view.ConsoleView;
import shape_generator.view.partial_view.ActionMessagePartialView;

public class ExitCommand implements ShapeCommand {
    private ConsoleView view;
    private static final String MSG = "Exit from program";

    public ExitCommand(ConsoleView view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.printMsg(new ActionMessagePartialView(MSG));
    }
}
