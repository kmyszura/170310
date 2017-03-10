
public class Main {
	public static void main(String args[]){
		Account ror = new Account ("ROR","5555 4444 4444 3333");
		Transaction operations = new Check(ror);
		operations.doTransaction();
		operations = new Deposit();
		operations.doTransaction();
		
		Client C1 = new Client("Maciej","Majewski","Wroclaw","Poland","12-900","Marynarska",70);
		
		Bank B1 = new Bank("BGZ","Warsaw","Poland","00-001","Poleczki",1);
	}

}
