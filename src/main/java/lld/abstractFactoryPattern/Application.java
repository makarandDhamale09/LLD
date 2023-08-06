package lld.abstractFactoryPattern;

import lld.abstractFactoryPattern.uifactory.UIFactory;

public class Application {

  private final Button button;

  private final CheckBox checkBox;

  public Application(UIFactory factory) {
    button = factory.createButton();
    checkBox = factory.createCheckBox();
  }

  public void paint() {
    button.paint();
    checkBox.paint();
  }

  public Button getButton() {
    return button;
  }

  public CheckBox getCheckBox() {
    return checkBox;
  }
}
