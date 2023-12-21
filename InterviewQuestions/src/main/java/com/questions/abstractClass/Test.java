package com.questions.abstractClass;

/**
 * In this case the answer is 0 as by default the int is initialized to zero;
 *
 * <p>Also the final keyword with abstract method is not allowed and gives compilation error.
 */
class Test extends Demo {

  @Override
  public void get() {
    System.out.println("a = " + a);
  }

  public static void main(String[] args) {
    Test obj = new Test();
    obj.get();
  }
}
