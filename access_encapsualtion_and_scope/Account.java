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
    balance += amount;
  }

  public void withdraw(double amount) {
    if (amount + transactionFee > balance) {
      System.out.println("Insufficient funds.");
    } else {
      balance -= amount + transactionFee;
    }
  }

  public void setTransactionFee(double transactionFee) {
    this.transactionFee = transactionFee;
  }

  public String toString() {
    return name + ", $" + balance;
  }
}
