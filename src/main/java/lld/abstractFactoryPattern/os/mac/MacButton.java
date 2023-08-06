package lld.abstractFactoryPattern.os.mac;

import lld.abstractFactoryPattern.Button;

public class MacButton implements Button {

  @Override
  public void paint() {
    System.out.println("MacButton painted");
  }
}
