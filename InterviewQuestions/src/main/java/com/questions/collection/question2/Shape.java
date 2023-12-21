package com.questions.collection.question2;

import java.util.ArrayList;
import java.util.List;

/**
 * Streams Reduce Method
 *
 * <p>Which ever identity is object is there is returned with the reduce method.
 */
public class Shape {
  private String name;
  private double diameter;

  public Shape(String name, double diameter) {
    this.name = name;
    this.diameter = diameter;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getDiameter() {
    return diameter;
  }

  public void setDiameter(double diameter) {
    this.diameter = diameter;
  }

  @Override
  public String toString() {
    return "Shape{" + "name='" + name + '\'' + ", diameter=" + diameter + '}';
  }

  public static void main(String[] args) {
    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Shape("S1", 286));
    shapes.add(new Shape("S2", 512));
    shapes.add(new Shape("S3", 268));
    shapes.add(new Shape("S4", 258));
    shapes.add(new Shape("S5", 431));
    shapes.add(new Shape("S6", 289));

    // which ever identity is object is there is returned with the reduce method
    Shape shape = shapes.stream().reduce(shapes.get(1), (a, b) -> a);
    System.out.println(shape);
  }
}
