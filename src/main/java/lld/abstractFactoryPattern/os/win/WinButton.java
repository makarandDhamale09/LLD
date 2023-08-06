package lld.abstractFactoryPattern.os.win;

import lld.abstractFactoryPattern.Button;

public class WinButton implements Button {

  @Override
  public void paint() {
    System.out.println("WinButton painted");
  }
}
