package tinkoff.generic;

/**
 * Box класс содержащий различные методы по работе с коробкой.
 *
 * @param <T> тип коробки
 * @version 1.0
 * @author Ekaterina Shubenkina
 */
public final class Box<T> {

    private T t;

    Box(final T box) {
        this.t = box;
    }

    public void setInTheBox(final T inTheBox) {
        if (inTheBox != null) {
            this.t = inTheBox;
        }
    }

    public T getFromTheBox() {
        if (this.t != null) {
            return t;
        }
        return null;
    }

    public void clearBox(final T box) {
    }

}