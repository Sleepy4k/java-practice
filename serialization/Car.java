package serialization;

import java.io.IOException;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;

public class Car implements Serializable {
  private String name;
  private int year;
  private transient String color; // transient keyword will not serialize this field
  private static final long serialVersionUID = 1L;

  public Car(String productName, int lauchYear, String color) {
    this.name = productName;
    this.year = lauchYear;
    this.color = color;
  }

  public String toString(){
    return String.format("Car make is: %s, Car year is: %d, Car color is: %s", this.name, this.year, this.color);
  }

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    Car toyota = new Car("Toyota", 2021, "Red");
    Car honda = new Car("Honda", 2020, "Blue");

    FileOutputStream fileOutputStream = new FileOutputStream("./serialization/cars.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

    objectOutputStream.writeObject(toyota);
    objectOutputStream.writeObject(honda);

    objectOutputStream.close();

    FileInputStream fileInputStream = new FileInputStream("./serialization/cars.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

    Car toyotaCopy = (Car) objectInputStream.readObject();
    Car hondaCopy = (Car) objectInputStream.readObject();

    objectInputStream.close();

    boolean isToyotaSameObject = toyotaCopy == toyota;
    boolean isHondaSameObject = toyotaCopy == toyota;

    System.out.println("Toyota (Copy) - " + toyotaCopy);
    System.out.println("Toyota (Original) - " + toyota);
    System.out.println("Toyota (Copy) - " + hondaCopy);
    System.out.println("Toyota (Original) - " + honda);
    System.out.println("Is toyota same object: "+ isToyotaSameObject);
    System.out.println("Is honda same object: " + isHondaSameObject);
  }
}
