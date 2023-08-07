public class switchcase {
  double billAmount;
  String shipping;
  
  public switchcase(double cost, String shippingMethod) {
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    double shippingCost = calculateShipping();
    
    System.out.println("Shipping cost: ");
    System.out.println(shippingCost);
  }
  
  public double calculateShipping() {
    double shippingCost;

    switch (shipping) {
      case "Regular":
        shippingCost = 0;
        break;
      case "Express":    
        shippingCost = 1.75;
        break;
      default:
        shippingCost = .50; 
    }

    return shippingCost;
 	}
  
  public static void main(String[] args) {
    switchcase book = new switchcase(9.99, "Express");
    
    book.ship();
  }
}
