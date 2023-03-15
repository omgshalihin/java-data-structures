package org.example.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPrac {

    public static void main(String[] args) {
        Map<Integer, Person> courseMap = new TreeMap<>(Map.of(
                5, new Person("Java", "Shalihin"),
                3, new Person(".net", "Philippe"),
                4, new Person("JavaScript", "Claudia"),
                1, new Person(".net", "Dean"),
                2, new Person("Java", "Filipe")
        ));
        System.out.println(courseMap);
    }

    static record Person(String course, String name){}
}
