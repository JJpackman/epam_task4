package subtask2.controller.command;

import subtask2.view.ConsoleView;
import subtask2.view.partial_view.ActionMessagePartialView;

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
