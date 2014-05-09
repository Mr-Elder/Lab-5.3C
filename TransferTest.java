/**
 * @(#)TransferTest.java
 *
 *
 * @author 
 * @version 1.00 2014/5/2
 */


public class TransferTest {

    public static void main(String[] args){
    	Account acct1 = new Account(1000, "Robert", 3749237);
    	Account acct2 = new Account(2000, "Max", 392479);
    
    	int choice  = 0;
    	
    	while(choice != 2){
    		choice = GetInfo.getOption("Transfer from : ", new String[]{acct1.getName() + " to " + acct2.getName(), acct2.getName() + " to " + acct1.getName(), "Quit"});
    	
    		if(choice == 0){
    			acct1.transfer(acct2, (double)GetInfo.getDouble("How much would you like to withdraw?"));
    		}else if (choice == 1){
    			acct2.transfer(acct1, (double)GetInfo.getDouble("How much would you like to withdraw?"));
    		}
    		
    		if(choice != 2) GetInfo.showMessage(acct1.getName() + " : " + acct1.getBalance() + "\n" + acct2.getName() + ": " + acct2.getBalance());
    	}
    	
    	acct1.printSummary();
    	acct2.printSummary();
    }
    
    
}