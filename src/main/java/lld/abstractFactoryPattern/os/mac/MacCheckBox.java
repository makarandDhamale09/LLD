package lld.abstractFactoryPattern.os.mac;

import lld.abstractFactoryPattern.CheckBox;

public class MacCheckBox implements CheckBox {

  @Override
  public void paint() {
    System.out.println("MacCheckbox painted");
  }
}
