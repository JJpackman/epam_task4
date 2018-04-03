package shape_generator.view;

import shape_generator.model.entity.Shape;
import shape_generator.utils.UserInput;
import shape_generator.view.constant.ConsoleMsgConstants;
import shape_generator.view.partial_view.ActionMessagePartialView;
import shape_generator.view.partial_view.MessagePartialView;

public class ConsoleView {
    public void printMsg(MessagePartialView view) {
        view.print();
    }

    public void printResult(MessagePartialView view, Shape... shapes) {
        if (shapes.length == 0) {
            view.setMessageContent(ConsoleMsgConstants.NOT_FOUND);
        }

        view.print();

        for (Shape p : shapes) {
            System.out.println(p);
        }
    }

    private void drawMenu() {
        printMsg(new ActionMessagePartialView(ConsoleMsgConstants.MENU_HEADER));
        System.out.println(
                "1) Display shapes\n" +
                "2) Calculate sum of areas of all shapes\n" +
                "3) Calculate sum of areas of specified shape\n" +
                "4) Sort shapes by area\n" +
                "5) Sort shapes by color\n" +
                "6) Exit"
        );
    }

    public int selectMenuItem() {
        drawMenu();
        printMsg(new ActionMessagePartialView(ConsoleMsgConstants.ITEM_SELECTION));
        return UserInput.getInteger();
    }
}
