package lld.abstractFactoryPattern.os.win;

import lld.abstractFactoryPattern.CheckBox;

public class WinCheckBox implements CheckBox {

  @Override
  public void paint() {
    System.out.println("WinCheckBox painted");
  }
}
