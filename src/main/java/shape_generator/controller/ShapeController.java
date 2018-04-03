package shape_generator.controller;

import shape_generator.controller.command.ShapeCommandInvoker;
import shape_generator.controller.constant.ShapeActionsConstants;
import shape_generator.model.ShapeManager;
import shape_generator.view.ConsoleView;
import shape_generator.view.partial_view.ErrorMessagePartialView;

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
