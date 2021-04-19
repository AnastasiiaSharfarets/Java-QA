package controller;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayListApp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("yellow");
        list.add("blue");
        list.add("green");
        list.add("black");
        System.out.println(Arrays.toString(list.toArray()));
        ArrayList<String>removalList = new ArrayList<>();
        removalList.add("blue");
        removalList.add("black");
        list.removeAll(removalList);
        System.out.println(Arrays.toString(list.toArray()));
    }

}
