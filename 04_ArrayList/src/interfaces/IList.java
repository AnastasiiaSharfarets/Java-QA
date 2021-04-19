package interfaces;

public interface IList<E> {
    int size();

    default boolean isEmpty() {
        return size() == 0;
    }

    default boolean contains(E elem) {
        return indexOf(elem) >= 0;
    }

    int indexOf(E elem);

    int lastIndexOf(E elem);

    E get(int index);

    E set(int index, E elem);

    boolean add(E elem);

    boolean add(int index, E elem);

    E remove(int index);

    boolean remove(E elem);

    void clear();
}
