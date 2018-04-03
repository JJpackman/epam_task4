package subtask2.controller;

import subtask2.controller.command.ShapeCommandInvoker;
import subtask2.controller.constant.ShapeActionsConstants;
import subtask2.model.ShapeManager;
import subtask2.view.ConsoleView;
import subtask2.view.partial_view.ErrorMessagePartialView;

public class ShapeController {
    private ShapeCommandInvoker commandInvoker;
    private ConsoleView view;

    public ShapeController(ShapeManager model, ConsoleView view) {
        this.commandInvoker = ShapeCommandInvoker.createShapeCommandInvoker(model, view);
        this.view = view;
    }

    private void handleException(Exception e) {
        view.printMsg(new ErrorMessagePartialView(e.getMessage()));
    }

    private void init() {
        try {
            commandInvoker.executeCommand(ShapeActionsConstants.FILL);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void run() {
        init();

        int selectedItem;

        while ((selectedItem = view.selectMenuItem()) != ShapeActionsConstants.EXIT) {
            try {
                commandInvoker.executeMenuCommand(selectedItem);
            } catch (Exception e) {
                handleException(e);
            }
        }

        commandInvoker.executeCommand(ShapeActionsConstants.EXIT);
    }
}
