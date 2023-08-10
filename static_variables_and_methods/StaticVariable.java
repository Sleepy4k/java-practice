package static_variables_and_methods;

public class StaticVariable {
  public static int totalATMs;
  public static int totalMoney;

  public int money;

  public StaticVariable(int money) {
    this.money = money;

    totalATMs++;
    totalMoney += money;
  }

  public void withdrawMoney(int money) {
    this.money -= money;
    totalMoney -= money;
  }

  public void depositMoney(int money) {
    this.money += money;
    totalMoney += money;
  }

  public static void getAverageMoney() {
    System.out.println("Average money: " + totalMoney / totalATMs);
  }

  public static void main(String[] args) {
    StaticVariable atm1 = new StaticVariable(1000);
    StaticVariable atm2 = new StaticVariable(2000);
    StaticVariable atm3 = new StaticVariable(3000);

    atm1.withdrawMoney(500);
    atm2.depositMoney(1000);
    atm3.withdrawMoney(2000);

    System.out.println("ATM 1: " + atm1.money);
    System.out.println("ATM 2: " + atm2.money);
    System.out.println("ATM 3: " + atm3.money);

    StaticVariable.getAverageMoney();
  }
}
