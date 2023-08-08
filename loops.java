import java.util.ArrayList;

public class loops {
  public static void main(String[] args) {
    String[] menuItems = {"Cheese", "Pepperoni", "Black Olives", "Sausage", "Peppers"};
    double[] menuPrices = {2.50, 3.00, 0.50, 3.00, 0.50};
    ArrayList<String> orderItems = new ArrayList<String>();

    orderItems.add("Cheese");
    orderItems.add("Pepperoni");
    orderItems.add("Black Olives");
    orderItems.add("Sausage");

    for (int i = 0; i < menuItems.length; i++) {
      System.out.println(menuItems[i] + ": $" + menuPrices[i]);
    }
    
    for (double price : menuPrices) {
      System.out.println("$" + price);
    }

    while (orderItems.size() > 0) {
      System.out.println("Removing " + orderItems.get(0) + " from order.");
      orderItems.remove(0);
    }
  }
}
