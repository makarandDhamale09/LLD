package lld.abstractFactoryPattern.uifactory;

import lld.abstractFactoryPattern.Button;
import lld.abstractFactoryPattern.CheckBox;
import lld.abstractFactoryPattern.os.mac.MacButton;
import lld.abstractFactoryPattern.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {
  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new MacCheckBox();
  }
}
