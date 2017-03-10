
public class Deposit implements Transaction{
	public Account accountFrom;
	public Deposit(){
		
	}
	@Override
	public void doTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Deposit doTransaction");
	}
	@Override
	public void stopTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Deposit stopTransaction");
	}
	@Override
	public void deleteTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Deposit deleteTransaction");
	}
}
