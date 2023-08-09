public class ifelse {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public ifelse(boolean filled, double cost, String shippingMethod) {
    if (cost > 24.00) {
      System.out.println("High value item!");
    } else {
      System.out.println("Low value item!");
    }

    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public static void main(String[] args) {
    ifelse book = new ifelse(true, 9.99, "Express");
    
    book.ship();
  }
}
