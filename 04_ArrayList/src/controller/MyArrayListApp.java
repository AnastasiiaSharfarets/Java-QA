package controller;

import model.MyArrayList;

import java.util.ArrayList;

public class MyArrayListApp {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        String[] strings = new String[10];
        System.out.println(strings);
        //long l = 10000000000000L;
        // String[] strings2 = new String[l];
        //String[] strings2 = new String[Integer.MAX_VALUE - 9];
        // MyArrayList<String> myArrayList = new MyArrayList<>(-1);
        String str = strings[2];
        MyArrayList<String> myArrayList = new MyArrayList<>(5);
//        myArrayList.get(6);
        String[] strings1 = new String[10];
        Integer newInt = 120;
//        strings1[0]=newInt;
    }

}
