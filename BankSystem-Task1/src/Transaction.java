
import java.sql.Date;

public class Transaction {
	private  String transactionType;
	private double transactionAmount;
	private Date transactionDate;
	
	//constructor
	public Transaction(String type, double amount) {
		this.setTransactionType(type);
		this.setTransactionAmount(amount);
		long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);
		this.setTransactionDate(date);
	}

// setters and getters
	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	//Override toString method
		public String toString() 
	    { 
	        return transactionType + ", " + transactionAmount + ", " + transactionDate ;
	    }
		
}
