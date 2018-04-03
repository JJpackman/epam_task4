package subtask2.controller.command;

import subtask2.model.ShapeManager;
import subtask2.model.entity.enums.ShapeName;
import subtask2.utils.UserInput;
import subtask2.view.ConsoleView;
import subtask2.view.partial_view.ActionMessagePartialView;

public class CalculateAreaSumForSpecificShapeCommand implements ShapeCommand {
    private ConsoleView view;
    private ShapeManager model;
    private static final String EXISTING_SHAPES_MSG;
    private static final String ENTRY_MSG;
    private static final String RESULT_MSG;
    private static final String ERROR_MSG;

    static {
        final StringBuilder sb = new StringBuilder();

        for (ShapeName n : ShapeName.values()) {
            sb.append(n.name().toLowerCase()).append("\n");
        }

        EXISTING_SHAPES_MSG = "Existing shape names:\n" + sb.toString();
        ENTRY_MSG = "Type in shape name (insensitive):";
        RESULT_MSG = "Sum of shapes' area of type:";
        ERROR_MSG = "Error: incorrect shape name";
    }

    public CalculateAreaSumForSpecificShapeCommand(ConsoleView view, ShapeManager model) {
        this.view = view;
        this.model = model;
    }

    private ShapeName getShapeName(final String shapeName) {
        for (ShapeName n : ShapeName.values()) {
            if (shapeName.toLowerCase().equals(n.name().toLowerCase())) {
                return n;
            }
        }

        throw new IllegalArgumentException(ERROR_MSG);
    }

    @Override
    public void execute() {
        view.printMsg(new ActionMessagePartialView(EXISTING_SHAPES_MSG));
        view.printMsg(new ActionMessagePartialView(ENTRY_MSG));

        ShapeName shapeName = getShapeName(UserInput.getString());

        view.printMsg(new ActionMessagePartialView(String.format("%s %s is %.2f",
                RESULT_MSG, shapeName.name().toLowerCase(), model.calcAreaSum(shapeName))));
    }
}
