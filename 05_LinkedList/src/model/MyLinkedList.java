package model;

import interfaces.IList;

public class MyLinkedList <E> implements IList<E> {
    private static class Node<E> {
        E data;
        Node<E> prev;
        Node<E> next;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    int size;
    private Node<E> head;  //null - head - node1 - node2 - node3 - node4 - tail - null
    private Node<E> tail;

    @Override
    public int size() {
        //TODO
        return 0;
    }

    @Override
    public int indexOf(E elem) {
        int index = 0;
        if (elem == null) {
            //for(int i =0; i<arr.length;i++)
            for (Node<E> checkThisNode = head; checkThisNode != null; checkThisNode = checkThisNode.next) {
                if (checkThisNode.data == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<E> checkThisNode = head; checkThisNode != null; checkThisNode = checkThisNode.next) {
                if (elem.equals(checkThisNode.data)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E elem) {
        //TODO
        return 0;
    }

    @Override
    public E get(int index) {
        Node<E> res = getNodeByIndex(index);
        return res.data;
    }

    private Node<E> getNodeByIndex(int index) {
        checkIndex(index);
        Node<E> res;
        if (index <= size / 2) {
            res = head;
            for (int i = 0; i < index; i++) {
                res = res.next;
            }
        } else {
            res = tail;
            for (int i = size - 1; i > index; i--) {
                res = res.prev;
            }
        }

        return res;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index + "is out of bounds");
        }
    }

    @Override
    public E set(int index, E elem) {
        //TODO
        return null;
    }

    @Override
    public boolean add(E elem) {
        Node<E> newNode = new Node<>(tail, elem, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean add(int index, E elem) {
        //TODO
        return false;
    }

    @Override
    public E remove(int index) {
        return unlink(getNodeByIndex(index));
    }

    private E unlink(Node<E> nodeToUnlink) {
        E res = nodeToUnlink.data;
        Node<E> prev = nodeToUnlink.prev;
        Node<E> next = nodeToUnlink.next;
        prev.next = next;
        next.prev = prev;
        nodeToUnlink.next = null;
        nodeToUnlink.data = null;
        nodeToUnlink.prev = null;
        size--;
        return res;
    }

    @Override
    public boolean remove(E elem) {
        //TODO
        return false;
    }

    @Override
    public void clear() {
        Node<E> next;
        for (Node<E> x = head; x!=null; x=next){
            next = x.next;
            x.data = null;
            x.prev=null;
            x.next = null;
        }
    }
}
