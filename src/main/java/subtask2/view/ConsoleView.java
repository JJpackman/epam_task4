package subtask2.view;

import subtask2.model.entity.Shape;
import subtask2.utils.UserInput;
import subtask2.view.constant.ConsoleMsgConstants;
import subtask2.view.partial_view.ActionMessagePartialView;
import subtask2.view.partial_view.MessagePartialView;

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
