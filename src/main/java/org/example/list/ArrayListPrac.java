package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPrac {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>(Arrays.asList(
                "blue",
                "purple",
                "yellow"
        ));

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println("contains yellow: " + colors.contains("yellow"));
        System.out.println("contains pink: " + colors.contains("pink"));

        System.out.println();

        colors.remove("yellow");
        colors.add("pink");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println("contains yellow: " + colors.contains("yellow"));
        System.out.println("contains pink: " + colors.contains("pink"));

        System.out.println();

        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println();

        colors.forEach(System.out::println);

        System.out.println();

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

    }
}
