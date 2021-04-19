package model;

public class Printer2 <Q>{
    Q elem;

    public Printer2(Q elem) {
        this.elem = elem;
    }

    public Q getElem() {
        return elem;
    }

    @Override
    public String toString() {
        return "{" + elem + "}";
    }
}
