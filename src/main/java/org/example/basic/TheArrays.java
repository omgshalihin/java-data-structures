package org.example.basic;

import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {
        // empty array of length 5
        String[] colors = new String[5];

        // set index 0 and 1 of the colors array
        colors[0] = "purple";
        colors[1] = "blue";

        // view the colors array
        // [purple, blue, null, null, null]
        System.out.println(Arrays.toString(colors));

        // replace index 0
        colors[0] = "black";

        // view the new colors array
        // [black, blue, null, null, null]
        System.out.println(Arrays.toString(colors));

        // pre-defined array of length 2
        int[] numbers = {100, 200};
        System.out.println(Arrays.toString(numbers));

        // loops
        System.out.println("Basic Loop: ");
        for (int i = 0; i < colors.length ; i++) {
            System.out.println(colors[i]);
        }
        System.out.println("Basic Loop in reverse: ");
        for (int i = colors.length-1; i >= 0 ; i--) {
            // reverse
            System.out.println(colors[i]);
        }

        System.out.println("Enhanced Loop: ");
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("Stream: ");
        Arrays.stream(colors).forEach(System.out::println);
    }
}
