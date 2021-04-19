package controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Создать класс c main. В main создать массив String {“abc”, “ab”, “abcd”,”abcd”,”ab”,”a”}
//
//Используя HashMap собрать пары ключ-значение для всех String, представленных в массиве, и количество их повторений.
//
//Вывести конечный результат в консоль
public class MapString {
    public static void main(String[] args) {
        String[] arr = {"abc", "ab", "abcd", "abcd", "ab", "a"};
        Map<String, Integer> stringMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (stringMap.containsKey(arr[i])) {
                int currentValue = stringMap.get(arr[i]);
                currentValue += 1;
                stringMap.put(arr[i], currentValue);
            } else{
                stringMap.put(arr[i], 1);
            }
        }
        System.out.println(Arrays.toString(stringMap.entrySet().toArray()));

    }
}
