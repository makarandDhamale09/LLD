package com.questions.collection.question1;

import java.util.Set;
import java.util.TreeSet;

/**
 * All type of casting of int and Integer work with set and a new Integer is created it still
 * compares with equals method and only distinct values are added.
 */
public class Set1 {
  public static void main(String[] args) {
    Set<Integer> set = new TreeSet<>();
    set.add(3);
    set.add((int) 3.0);
    set.add(2);
    set.add(2);
    set.add(Integer.valueOf(2));
    set.add(Integer.parseInt("2"));

    System.out.println(set);
  }
}
