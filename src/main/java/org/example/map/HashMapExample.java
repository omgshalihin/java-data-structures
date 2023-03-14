package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Baba"));
        map.put(3, new Person("Cat"));
        map.put(3, new Person("Cat 2"));

        System.out.println("Size of map: " + map.size());
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.containsKey(4));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println();

        map.entrySet().forEach(System.out::println);
    }

    record Person(String name){}
}
