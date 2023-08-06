package lld.strategyPattern.strategy;

public class SportsDriveStrategy implements DriveStrategy {
  @Override
  public void drive() {
    System.out.println("This is sports drive strategy");
  }
}
