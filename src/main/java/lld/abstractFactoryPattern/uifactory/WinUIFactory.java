package lld.abstractFactoryPattern.uifactory;

import lld.abstractFactoryPattern.Button;
import lld.abstractFactoryPattern.CheckBox;
import lld.abstractFactoryPattern.os.win.WinButton;
import lld.abstractFactoryPattern.os.win.WinCheckBox;

public class WinUIFactory implements UIFactory {
  @Override
  public Button createButton() {
    return new WinButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new WinCheckBox();
  }
}
