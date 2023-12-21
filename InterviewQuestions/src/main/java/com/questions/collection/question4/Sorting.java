package com.questions.collection.question4;

import java.util.Comparator;

public class Sorting implements Comparator<Person> {
  @Override
  public int compare(Person o1, Person o2) {
    return o1.age.compareTo(o2.age);
  }

  @Override
  public boolean equals(Object obj) {
    return false;
  }
}
