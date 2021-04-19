package model;

import interfaces.IList;

import java.util.Arrays;

public class MyArrayList<E> implements IList<E> {
    private Object[] elementData;
    private int size;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    public MyArrayList(int capacity) {
        if (capacity > MAX_ARRAY_SIZE) {
            capacity = MAX_ARRAY_SIZE;
        }
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity value: " + capacity);
        }
        elementData = new Object[capacity];
        size = 0;
    }

    public MyArrayList() {
        //elementData = new Object[10];
        this(10);

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(E elem) {
        if (elem == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null)
                    return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                // if (elementData[i].equals(elem)) return i;
                if (elem.equals(elementData[i])) return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E elem) {
        if (elem == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if (elem.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elementData[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");

        }
    }

    @Override
    //показывает замещаемый элемент
    public E set(int index, E elem) {
        checkIndex(index);
        E remElem = (E) elementData[index];
        elementData[index] = elem;
        return remElem;
    }

    @Override
    //добавляем элемент в середину списка
    public boolean add(E elem) {
        ensureCapacity();
        elementData[size++] = elem;
        //size++;
        return true;
    }

    private void ensureCapacity() {
        if (size == MAX_ARRAY_SIZE) {
            throw new OutOfMemoryError();
        }
        if (size == elementData.length) {
            int oldCapacity = elementData.length;
            //int newCapacity = oldCapacity + oldCapacity * 2;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            if (newCapacity <= 0 || newCapacity > MAX_ARRAY_SIZE) {
                newCapacity = MAX_ARRAY_SIZE;
            }
            grow(newCapacity);
        }
    }

    private void grow(int newCapacity) {
        //elementData = Arrays.copyOf(elementData, newCapacity);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = elementData[i];
        }
        elementData = newArray;
    }

    @Override//добавляет элемент в опр-й индекс
    public boolean add(int index, E elem) {
        if (index == size) {
            add(elem);
            return true;
        }
        checkIndex(index);
        ensureCapacity();
        Object[] newArray = new Object[elementData.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = elementData[i];
        }
        newArray[index] = elem;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = elementData[i - 1];
        }
        elementData = newArray;
        //System.arraycopy(elementData, index, elementData, index+1,size-index);
        size++;
        return true;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E resElem = (E) elementData[index];
        Object[] newArray = new Object[elementData.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = elementData[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = elementData[i + 1];
        }
        elementData = newArray;
        size--;
        //              source
        //System.arraycopy(elementData,index+1, elementData, index, size-(index+1) );
        return resElem;
    }

    @Override
    public boolean remove(E elem) {
        int temp = indexOf(elem);
        if (temp < 0) {
            return false;
        }
        remove(temp);
        return true;
    }

    @Override
    public void clear() {
//    Object[]newArray= new Object[elementData.length];
//    elementData = newArray;
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }

    public E[] toArray(){
        return (E[])elementData.clone();
    }
}
