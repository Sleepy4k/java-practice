package custom_serialization;

public class Engine {
  private double liters;
  private int horsePower;

  public Engine(double liters, int horsePower) {
    this.liters = liters;
    this.horsePower = horsePower;
  }

  public double getLiters() {
    return this.liters;
  }

  public int getHorsePower() {
    return this.horsePower;
  }

  @Override
  public String toString() {
    return "Engine{"
      + "liters=" + liters
      + ", horsePower=" + horsePower
      + '}';
  }
}
