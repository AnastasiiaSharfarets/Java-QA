package model;

public class Printer1 {
    Object elem;

    public Printer1(Object elem) {
        this.elem = elem;
    }

    public Object getElem() {
        return elem;
    }

    @Override
    public String toString() {
        return "[" + elem + "]";
    }
}
