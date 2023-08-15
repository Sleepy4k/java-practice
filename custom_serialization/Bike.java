package custom_serialization;

import java.io.Serializable;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;

public class Bike implements Serializable {
  private String name;
  private int year;
  private Engine engine;
  private static final long serialVersionUID = 1L;

  public Bike(String name, int year) {
    this.name = name;
    this.year = year;
    this.engine = new Engine(12.5, 100);
  }

  private void writeObject(ObjectOutputStream stream) throws IOException {
    stream.writeObject(this.name);
    stream.writeInt(this.year);
    stream.writeDouble(this.engine.getLiters());
    stream.writeInt(this.engine.getHorsePower());
  }

  private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
    this.name = (String) stream.readObject();
    this.year = (int) stream.readInt();
    double liters = (double) stream.readDouble();
    int power = (int) stream.readInt();
    this.engine = new Engine(liters, power);
  }    

  @Override
  public String toString(){
    return String.format("Car make is: %s, Car year is: %d, %s", this.name, this.year, this.engine);
  }

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    Bike bike = new Bike("Honda", 2015);
    
    FileOutputStream fileOutputStream = new FileOutputStream("./custom_serialization/bikes.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

    objectOutputStream.writeObject(bike);
    objectOutputStream.close();

    FileInputStream fileInputStream = new FileInputStream("./custom_serialization/bikes.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

    Bike bikeCopy = (Bike) objectInputStream.readObject();
    objectInputStream.close();

    boolean isSameObject = bikeCopy == bike;
    System.out.println("Bike (Copy) - " + bikeCopy);
    System.out.println("Bike (Original) - " + bike);
    System.out.println("Is same object: " + isSameObject);
  }
}
