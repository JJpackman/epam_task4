package shape_generator.controller.command;

import shape_generator.controller.constant.ShapeActionsConstants;
import shape_generator.model.ShapeManager;
import shape_generator.view.ConsoleView;

import java.util.HashMap;
import java.util.Map;

public class ShapeCommandInvoker {
    private Map<Integer, ShapeCommand> commands;
    private static final String ILLEGAL_COMMAND = "Error: command not found";
    private static final int[] ALLOWED_USER_COMMANDS = {
            ShapeActionsConstants.DISPLAY,
            ShapeActionsConstants.CALC_ALL_AREA_SUM,
            ShapeActionsConstants.CALC_SPECIFIED_AREA_SUM,
            ShapeActionsConstants.SORT_BY_AREA,
            ShapeActionsConstants.SORT_BY_COLOR,
            ShapeActionsConstants.EXIT
    };

    private ShapeCommandInvoker() {
        this.commands = new HashMap<>();
    }

    public void addCommands(Map<Integer, ShapeCommand> commands) {
        this.commands.putAll(commands);
    }

    public void executeCommand(int command) {
        try {
            commands.get(command).execute();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(ILLEGAL_COMMAND, e);
        }
    }

    private boolean isCommandAllowed(int command) {
        for (int c : ALLOWED_USER_COMMANDS) {
            if (command == c) {
                return true;
            }
        }

        return false;
    }

    public void executeMenuCommand(int command) {
        if (isCommandAllowed(command)) {
            executeCommand(command);
        } else {
            throw new IllegalArgumentException(ILLEGAL_COMMAND);
        }
    }

    public static ShapeCommandInvoker createShapeCommandInvoker(ShapeManager model, ConsoleView view) {
        final Map<Integer, ShapeCommand> commands = new HashMap<Integer, ShapeCommand>() {
            {
                put(ShapeActionsConstants.FILL, new FillWithShapesCommand(view, model));
                put(ShapeActionsConstants.DISPLAY, new DisplayCommand(view, model));
                put(ShapeActionsConstants.CALC_ALL_AREA_SUM, new CalculateAreaSumCommand(view, model));
                put(ShapeActionsConstants.CALC_SPECIFIED_AREA_SUM, new CalculateAreaSumForSpecificShapeCommand(view, model));
                put(ShapeActionsConstants.SORT_BY_AREA, new SortByAreaCommand(view, model));
                put(ShapeActionsConstants.SORT_BY_COLOR, new SortByColorCommand(view, model));
                put(ShapeActionsConstants.EXIT, new ExitCommand(view));
            }
        };

        final ShapeCommandInvoker commandInvoker = new ShapeCommandInvoker();
        commandInvoker.addCommands(commands);

        return commandInvoker;
    }
}
