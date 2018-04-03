package shape_generator.view.partial_view;

import shape_generator.view.constant.ConsoleColorConstants;

import java.util.Arrays;

public class ActionMessagePartialView extends MessagePartialView {
    public ActionMessagePartialView(String messageContent) {
        super(messageContent, ConsoleColorConstants.ANSI_BLUE);
    }

    @Override
    public void print() {
        final String msg = getMessageContent();

        final char[] delimiter = new char[msg.length()];
        Arrays.fill(delimiter, '*');

        applyColor();

        System.out.println(delimiter);
        System.out.println(msg);
        System.out.println(delimiter);

        reset();
    }
}
