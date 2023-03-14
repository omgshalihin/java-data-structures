package org.example.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();

        // add 2 people
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Cat", 54));
        linkedList.addFirst(new Person("Ali", 18));
        System.out.println(linkedList);

        System.out.println();

        // iterate linked-list to have next and previous
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }

        System.out.println();

        // insert new person between alex and car
        linkedList.add(1, new Person("Siri", 99));
        ListIterator<Person> personListIterator1 = linkedList.listIterator();
        while (personListIterator1.hasNext()) {
            System.out.println(personListIterator1.next());
        }

    }

    static record Person(String name, int age){}
}
