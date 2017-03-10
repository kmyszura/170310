
public class Check implements Transaction{
	public Account accountTo;
	public Check(Account accountToIn) {
		accountTo = accountToIn;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void doTransaction() {
		// TODO Auto-generated method stub
		//System.out.println("Check doTransaction to "+accountTo.Name);
	}
	@Override
	public void stopTransaction() {
		// TODO Auto-generated method stub
		//System.out.println("Check stopTransaction");
	}
	@Override
	public void deleteTransaction() {
		// TODO Auto-generated method stub
		//System.out.println("Check deleteTransaction");
	}
}
