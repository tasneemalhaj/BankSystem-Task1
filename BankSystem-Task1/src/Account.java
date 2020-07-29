
import java.util.ArrayList;

public class Account {
	private String code;
	private String name;
	private double balance;
	private ArrayList<Transaction> transactions;
	
	
	// constructor 
	public Account(String initialCode, String initialName) {
		code = initialCode + "_PS";
		name = "EXALT_" + initialName;
		balance = 0;
		setTransactions(new ArrayList<Transaction>()); 
		
	}
	
	//setters and getters
	
	public String getAccountName() {
	    return name;
	  }
	public void setAccountName(String name) {
		this.name = name;
	}
	
	public String getAccountCode() {
	    return code;
	  }
	public void setAccountCode(String code) {
		this.code = code;
	}
	
	public double getAccountBalance() {
	    return balance;
	  }
	public void setAccountBalance(double balance) {
		this.balance = balance;
	}
	
	
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	
	//Override toString method
	public String toString() 
    { 
        return name + ", " + code + ", " + balance ;
    }

	// Add transaction to Account 
	public void performTransaction(Transaction trans) {
		
		//Deposit
		if(trans.getTransactionType() == "D") {
			
			this.balance = this.balance + trans.getTransactionAmount();
			this.transactions.add(trans);
			
		}else if(trans.getTransactionType() == "W" && trans.getTransactionAmount() > this.balance) {
			
			System.out.println("wedthrow transaction can't be done");
		//withdraw
		}else if (trans.getTransactionType() == "W" && trans.getTransactionAmount() <= this.balance) {
			
			this.balance = this.balance - trans.getTransactionAmount();
			this.transactions.add(trans);


		}
	}
	
	//Show the last N transaction for an account
	public void showLastNTransaction(int n) {
		
		//check if the availability of the requested transaction number
		if(n <= this.transactions.size() ) {
			for(int i = this.transactions.size()-1; i>= this.transactions.size() - n ; i--) {
				System.out.println(this.transactions.get(i).toString());
			}
		}else {
			System.out.println("this number of transactions is not avaialble, plz enter a samaller number");

		}
	}
	
	
	
	

}

