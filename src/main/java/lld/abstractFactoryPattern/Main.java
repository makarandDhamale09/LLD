package lld.abstractFactoryPattern;

import lld.abstractFactoryPattern.uifactory.MacUIFactory;

/**
 * AbstractFactory can be considered as factory of factory. In this case we have MacUIFactory and
 * WinUIFactory. Calling the individual factory will automatically create all its components without
 * us worrying about it.
 */
public class Main {

  public static void main(String[] args) {
    Application application = new Application(new MacUIFactory());
    application.paint();
  }
}
