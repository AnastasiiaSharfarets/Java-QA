package model;

public class GenericModel<E> {
    private E elem;

    public GenericModel(E elem) {
        this.elem = elem;
        if (this.elem instanceof Cat) {
            System.out.println("Initialized by class Cat");
        }
        if (this.elem instanceof Dog) {
            System.out.println("Initialized by class Dog");
        }
        if (!(this.elem instanceof Cat || this.elem instanceof Dog)) {
            System.out.println("Initialized by unknown class");
        }
    }

    public E getElem() {
        return elem;
    }

    public void setElem(E newElem) {
        this.elem = newElem;
    }

    @Override
    public String toString() {
        return "GenericModel{" +
                "elem=" + elem +
                '}';
    }
}
