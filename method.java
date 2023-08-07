public class method {
  int balance;
  
  public method(int initialBalance){
    balance = initialBalance;
  }

  public void checkBalance() {
    System.out.println("Hello!\nYour balance is " + balance);
  }

  public void deposit(int amountToDeposit) {
    balance += amountToDeposit;
    System.out.println("You just deposited " + amountToDeposit);
  }

  public int withdraw(int amountToWithdraw) {
    balance -= amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
    
    return amountToWithdraw;
  }

  public String toString() {
    return "You using Java Banking Service";
  }
  
  public static void main(String[] args){
    method savings = new method(2000);
    
    System.out.println(savings);

    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(300);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
  }       
}
