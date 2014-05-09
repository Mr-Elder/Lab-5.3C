//*******************************************************
// Account.java
//
// A bank account class with methods to deposit, withdraw, 
// and check the balance.
//*******************************************************


public class Account
{
  private double balance;
  private String name;
  private long acctNum;

    private static int numDeposits;
    private static int numWithdrawals = 0;
    private static int amtDeposits;
    private static int amtWithdrawals;


  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
	{
       balance -= amount;
       numWithdrawals++;
       amtWithdrawals += amount;
	}
    else
       System.out.println("Insufficient funds");

  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
    numDeposits++;
    amtDeposits += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }

  //----------------------------------------------
  // Returns account number
  //----------------------------------------------
  public double getAcctNumber()
  {
    return acctNum;
  }


  //----------------------------------------------
  // Prints account number, name, and balance
  //----------------------------------------------
  public void printSummary()
  {
      System.out.println("Account number: " + acctNum);
      System.out.println("Account owner: " + name);
      System.out.println("Account balance: " + balance);
  }
  
  public String getName(){
  	return name;
  }
  
  public void transfer(Account account, double amount){
  	
  	this.withdraw(amount);
  	
  	if(numWithdrawals > 0){
  		numWithdrawals = 0;
  		account.deposit(amount);
  	}
  	
  }

}
