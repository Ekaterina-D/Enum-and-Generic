package tinkoff.generic;

import java.util.Random;

/**
 * Box класс содержащий различные методы по работе с коробкой.
 *
 * @version 1.0
 * @author Ekaterina Shubenkina
 */
public class Utils {

    private static final int NUM = 3;

    public static void print(final String text) {
        System.out.println(text);
    }

    public static void print(final String text, final tinkoff.generic.Color color) {
        System.out.println(color + text + tinkoff.generic.Color.ANSI_RESET);
    }

    public static <T> tinkoff.generic.Box<T> boxObject(final T o) {
        return new tinkoff.generic.Box<T>(o);
    }

    /**
     * @param t   первый объект
     * @param u   второй объект
     * @param y   третий объект
     * @param <T> тип первого объекта
     * @param <U> тип второго объекта
     * @param <Y> тип третьего объекта
     * @return случайный объект
     */
    public <T, U, Y> Object randomObject(final T t, final U u, final Y y) {
        Random random = new Random();
        int num = random.nextInt(NUM);
        if (num == 0) {
            return t;
        } else if (num == 1) {
            return u;
        }
        return y;
    }

}