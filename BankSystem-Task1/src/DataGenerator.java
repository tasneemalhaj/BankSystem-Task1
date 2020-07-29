import java.util.ArrayList;
import java.util.Random;

public class DataGenerator {
	
	
	private ArrayList<Account> generatedAccounts;
	
	public DataGenerator () {
		this.generatedAccounts = new ArrayList<Account>();
		
	}

	
	// Get account from the generatedAccounts
	public Account getGeneratedAccount() {

	    	int min = 0;
		    int max = this.generatedAccounts.size() - 1;
	    	int random_index = (int)(Math.random() * (max - min + 1) + min);
		    
		    Account randomAccount = this.generatedAccounts.get(random_index);
			 System.out.println(randomAccount);

			return randomAccount;
	    
	}

	//Add account to the geneartedAccounts ArrayList
	public void setGeneartedAccounts(Account account) {
		this.generatedAccounts.add(account);
	}
	
	public void generateAccounts() {
		
		Account newAccount;
		for(int i = 0; i< 10; i++) {
			newAccount = new Account(generateRandomAccountCode(), generateRandomAccountName());
			this.setGeneartedAccounts(newAccount);
			
		}
		
		for(int i = 0; i<this.generatedAccounts.size(); i++) {
			System.out.println(generatedAccounts.get(i));
			
		}
		
		
	}
	
	//generate random account name
	public String generateRandomAccountName() {
		 
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	 
//	    System.out.println(generatedString);
	    return generatedString;
	    
	}
	
	//generate random account code
		public String generateRandomAccountCode() {
			 
			int min = 50;
		    int max = 100;
		    int random_int = (int)(Math.random() * (max - min + 1) + min);

		    return Integer.toString(random_int);
		    
		}
	
	
	
}
