package shape_generator.utils;

import java.util.Scanner;

public final class UserInput {
    private final static Scanner sc = new Scanner(System.in);

    public static int getInteger() {
        try {
            return Integer.valueOf(sc.nextLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: wrong number format", e);
        }
    }

    public static String getString() {
        return sc.nextLine();
    }
}
