package static_variables_and_methods;

public class StaticMethod {
  public static void getMoney() {
    System.out.println("I have money");
  }

  public static void main(String[] args) {
    StaticMethod.getMoney();
  }
}
