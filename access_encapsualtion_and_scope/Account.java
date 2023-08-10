package access_encapsualtion_and_scope;

public class Account {
  private String name;
  private double balance;
  private double transactionFee = 0.00;

  public Account(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    double newAmount = amount + this.transactionFee;

    if (newAmount > this.balance) {
      System.out.println("Insufficient funds.");
    } else {
      this.balance -= newAmount;
    }
  }

  public void setTransactionFee(double transactionFee) {
    this.transactionFee = transactionFee;
  }

  public String toString() {
    return this.name + ", $" + this.balance;
  }
}
