package controller;

import model.Printer1;
import model.Printer2;

import java.util.List;

public class GenericsApp {
    public static void main(String[] args) {
//        Object[] objects = new Object[5];
//        objects[0] = Integer.valueOf(100);
//        objects[1] = "str";
//        foo("str");

        //Printer1
//        Printer1 print1 = new Printer1(123);
//        System.out.println(print1);
//        Integer num = (Integer) print1.getElem();
//        System.out.println(num);
//        String str = (String) print1.getElem();
//        System.out.println(str);
        Printer2<String> printer2 = new Printer2<>("Hello");
        System.out.println(printer2);
        String str = printer2.getElem();
        Printer2<Integer> printer3 = new Printer2<>(123);
        Integer newInt = printer3.getElem();
        System.out.println(newInt);

    }

    public static void foo(int i) {
    }
}
