package lld.strategyPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {
  @Override
  public void drive() {
    System.out.println("This is normal drive Strategy");
  }
}
