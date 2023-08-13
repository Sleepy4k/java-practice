package serialization;

import java.io.IOException;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;

public class Car implements Serializable {
  private String name;
  private int year;
  private static final long serialVersionUID = 1L;

  public Car(String productName, int lauchYear) {
    this.name = productName;
    this.year = lauchYear;
  }

  public static void main(String[] args) throws FileNotFoundException, IOException {
    Car toyota = new Car("Toyota", 2021);
    Car honda = new Car("Honda", 2020);

    FileOutputStream fileOutputStream = new FileOutputStream("./serialization/cars.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

    objectOutputStream.writeObject(toyota);
    objectOutputStream.writeObject(honda);

    objectOutputStream.close();
  }
}
