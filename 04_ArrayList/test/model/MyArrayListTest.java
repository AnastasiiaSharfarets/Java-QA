package model;

import interfaces.IList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    static IList<Integer> list;
    static int startSize;

    @BeforeAll
    static void setUpBeforeAll() {
        startSize = 5;
    }

    @BeforeEach
    void setUp() {
        list = new MyArrayList<>(startSize);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(2);
    }

    @Test
    void isEmpty() {
        assertFalse(list.isEmpty());
    }

    @Test
    void contains() {
        assertTrue(list.contains(3));
        assertFalse(list.contains(10));
    }

    @Test
    void size() {
        assertEquals(4, list.size());
        list.add(5);
        assertEquals(5, list.size());
        list.remove(0);
        assertEquals(4, list.size());
    }

    @Test
    void indexOf() {
        assertEquals(0, list.indexOf((Integer) 2));
        assertEquals(-1, list.indexOf((Integer) 10));
    }

    @Test
    void lastIndexOf() {
        assertEquals(3, list.lastIndexOf((Integer) 2));
        assertEquals(-1, list.lastIndexOf((Integer) 10));
    }

    @Test
    void get() {
        assertEquals(8, list.get(2));
        // assertEquals(null, list.get(10)); ошибка
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(10);
        });
    }

    @Test
    void set() {
        assertEquals(8, list.set(2, (Integer) 10));
        assertEquals(10, list.get(2));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(10, 10);
        });
    }

    @Test
    void add() {
        assertTrue(list.add((Integer)7));
        assertEquals(4, list.indexOf((Integer) 7));
//        MyArrayList<Integer> arr = new MyArrayList<>();
//        assertThrows(OutOfMemoryError.class,()->{
//            for (int i = 0; i<Integer.MAX_VALUE;i++){
//                arr.add(i);
//            }
//        });

    }

    @Test
    void addAdv() {
        assertTrue(list.add(0, (Integer) 20));
        assertEquals(5, list.size());
        assertEquals(1, list.indexOf((Integer) 2));
        assertEquals(3, list.indexOf((Integer) 8));
        assertTrue(list.add(3, (Integer) 50));
        assertEquals(1, list.indexOf((Integer) 2));
        assertEquals(4, list.indexOf((Integer) 8));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.add(10, (Integer) 10);
        });
    }

    @Test
    void remove() {
        assertEquals(2, list.remove(0));
        assertNotEquals(2, list.remove(1));
    }

    @Test
    void removeAdv() {
        assertTrue(list.remove((Integer) 2));
        assertEquals(3, list.size());
        assertFalse(list.remove((Integer) 10));
        assertEquals(3, list.size());
    }

    @Test
    void clear() {
        list.clear();
        assertEquals(0, list.size());
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(0);
        });
    }
}