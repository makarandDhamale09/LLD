package lld.abstractFactoryPattern.uifactory;

import lld.abstractFactoryPattern.Button;
import lld.abstractFactoryPattern.CheckBox;

public interface UIFactory {

  Button createButton();

  CheckBox createCheckBox();
}
