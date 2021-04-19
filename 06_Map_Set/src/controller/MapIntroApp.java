package controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapIntroApp {
    public static void main(String[] args) {
        Map<String, Integer> usa = new HashMap<>();
        usa.put("Denver", 600_000);
        //System.out.println(usa.get("Denver"));
        usa.put("Boston", 670_000);
        usa.put("Chicago", 2_500_000);
        usa.put("Atlanta", 470_000);
        usa.put("New York", 8_500_000);
        usa.put("Dalas", 1_500_000);
        //usa.put(1_500_000, "ABC");

        Integer population = usa.get("Chicago");
        System.out.println(population);
        Integer oldPopulation = usa.put("Chicago", 2_500_001);
        System.out.println(oldPopulation);
        population = usa.get("Chicago");
        System.out.println(population);
        System.out.println(usa.containsKey("Detroit"));
        System.out.println(usa.containsValue(2_500_001));
        System.out.println(usa.size());
        System.out.println(usa.isEmpty());
        usa.remove("Chicago");
        System.out.println(usa.containsKey("Chicago"));
        System.out.println(usa.containsValue(2_500_001));
        System.out.println(usa.size());
        Collection<Integer> values = usa.values();
        int totalPopulation = 0;
        //Iterator
        for (Integer pop : values) {
            System.out.println(pop);
            totalPopulation = totalPopulation + pop;
        }
        System.out.println("Total population: " + totalPopulation);
        Collection<String> keys = usa.keySet();

        for (String key : keys) {
            System.out.println(key + "->" + usa.get(key));
        }
        //usa.entrySet();
    }
}
