package lld.factoryPattern;

public class ShapeFactory {

  public static Shape getShape(String name) {
      name = name.toUpperCase();
    return switch (name) {
      case "CIRCLE" -> new Circle();
      case "SQUARE" -> new Square();
      case "RECTANGLE" -> new Rectangle();
      default -> throw new IllegalStateException("Unexpected value: " + name);
    };
  }
}
