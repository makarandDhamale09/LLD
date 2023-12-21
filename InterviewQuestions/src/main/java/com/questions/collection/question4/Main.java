package com.questions.collection.question4;

import java.util.ArrayList;
import java.util.List;

/**
 * When a using a comparator (o1, o2) o1 is this value and o2 is next value.
 *
 * <p>o1.compareTo(o2) -> ascending order o2.compareTo(o1) -> descending order
 */
public class Main {
  public static void main(String[] args) {
    Person p1 = new Person("John", 30);
    Person p2 = new Person("Jack", 50);
    Person p3 = new Person("Rick", 20);
    Person p4 = new Person("Mak", 31);
    List<Person> personList = new ArrayList<>();
    personList.add(p1);
    personList.add(p2);
    personList.add(p3);
    personList.add(p4);

    System.out.println(personList);

    personList.sort(new Sorting());

    System.out.println(personList);
  }
}
