package access_encapsualtion_and_scope;

public class Bank {
  private Account account;

  public Bank() {
    account = new Account("Naka", 1000.00);
  }

  public void deposit(double amount) {
    account.deposit(amount);
  }

  public void withdraw(double amount) {
    account.withdraw(amount);
  }

  public void setTransactionFee(double transactionFee) {
    account.setTransactionFee(transactionFee);
  }

  public String toString() {
    return account.toString();
  }

  public static void main(String[] args) {
    Bank bank = new Bank();

    System.out.println(bank);

    bank.deposit(100.00);
    System.out.println(bank);

    bank.withdraw(50.00);
    System.out.println(bank);

    bank.setTransactionFee(10.00);
    bank.withdraw(50.00);
    System.out.println(bank);
  }
}
