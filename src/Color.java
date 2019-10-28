package tinkoff.generic;

import java.util.Random;

/**
 * Color класс содержащий различные цвета для текста.
 *
 * @version 1.0
 * @author Ekaterina Shubenkina
 */
public enum Color {

    ANSI_RESET("\u001B[0m"),
    ANSI_BLACK("\u001B[30m"),
    ANSI_RED("\u001B[31m"),
    ANSI_GREEN("\u001B[32m"),
    ANSI_YELLOW("\u001B[33m"),
    ANSI_BLUE("\u001B[34m"),
    ANSI_PURPLE("\u001B[35m"),
    ANSI_CYAN("\u001B[36m"),
    ANSI_WHITE("\u001B[37m");

    private String color;

    Color(final String colorString) {
        this.color = colorString;
    }

    public static Color randomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)];
    }

    @Override
    public String toString() {
        return color;
    }

    public String getColor() {
        return color;
    }

}