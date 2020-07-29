
import java.util.ArrayList;

public class Bank {
	
	private String bankName;
	private  ArrayList<Account> accounts;
	
	public Bank (String name) {
		this.setBankName(name);
		setAccounts(new ArrayList<Account>());
		
	}
	
// setters and getters 
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	
	
	//Add account to the a Bank 
	public void addAccountToBank (Account account) {

		this.accounts.add(account);
		
	}
	
	public void getAllAccounts() {
		
		for(int i = 0; i<this.accounts.size(); i++) {
			System.out.println(accounts.get(i));
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcom to the My Bank System");
		
		
		// Create bank
		Bank b1 = new Bank("Exalt");
		
		//Create bank account
		Account a1 = new Account("101", "Tas");

		b1.addAccountToBank(a1);
		a1.setAccountBalance(100);
		
		//System.out.println(a1.toString());

		b1.getAllAccounts();
		
		//create transaction
		Transaction trans1Depo = new Transaction("D", 3);
		//Add transaction to account
		 a1.performTransaction(trans1Depo);
		 
		Transaction trans2Withdrow = new Transaction("W", 4);
		 a1.performTransaction(trans2Withdrow);
		 
		 //System.out.println(a1.toString());


		Transaction trans3Depo = new Transaction("D", 50);
		a1.performTransaction(trans3Depo);
		
		Transaction trans4Withdrow = new Transaction("W", 10);
		a1.performTransaction(trans4Withdrow);
		 
		//get Generated Accounts ==> 1) create an instant of DataGenerator 2) call generateAccounts method
		DataGenerator dg = new DataGenerator();
		dg.generateAccounts();
		dg.getGeneratedAccount();
		
		a1.showLastNTransaction(2);

		
	}


	
	
}
