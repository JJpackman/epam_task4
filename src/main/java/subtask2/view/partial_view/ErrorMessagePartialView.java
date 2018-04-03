package subtask2.view.partial_view;

import subtask2.view.constant.ConsoleColorConstants;

import java.util.Arrays;

public class ErrorMessagePartialView extends MessagePartialView {
    public ErrorMessagePartialView(String messageContent) {
        super(messageContent, ConsoleColorConstants.ANSI_RED);
    }

    @Override
    public void print() {
        final String msg = getMessageContent();

        final char[] delimiter = new char[msg.length()];
        Arrays.fill(delimiter, '=');

        applyColor();

        System.out.println(delimiter);
        System.out.println(msg);
        System.out.println(delimiter);

        reset();
    }
}
