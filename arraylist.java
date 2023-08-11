import java.util.ArrayList;

public class arraylist {
  public static void main(String[] args) {
    ArrayList<String> shoppingCart = new ArrayList<String>();
    
    shoppingCart.add("Trench Coat");
    shoppingCart.add("Tweed Houndstooth Hat");
    shoppingCart.add("Magnifying Glass");
    shoppingCart.add("Long-sleeved button-down");
    shoppingCart.add("Pencil skirt");
    shoppingCart.add("Corset");
    shoppingCart.add("Fedora");
    shoppingCart.add("Suspenders");
    shoppingCart.add("Tweed Vest");
    shoppingCart.add("Wool Pants");
    
    System.out.println(shoppingCart);
    
    shoppingCart.remove("Wool Pants");
    
    System.out.println(shoppingCart);
    System.out.println(shoppingCart.size());
    
    shoppingCart.remove(3);
    
    System.out.println(shoppingCart);
    System.out.println(shoppingCart.size());
    
    shoppingCart.set(0, "Trench Coat - Black");
    
    System.out.println(shoppingCart);
    System.out.println(shoppingCart.get(1));
    System.out.println(shoppingCart.indexOf("Pencil skirt"));
    System.out.println(shoppingCart.indexOf("Fedora"));
    System.out.println(shoppingCart.indexOf("Top Hat"));
    System.out.println(shoppingCart.isEmpty());
    
    shoppingCart.clear();
    
    System.out.println(shoppingCart.isEmpty());
    System.out.println(shoppingCart);
  }
}
