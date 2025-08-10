package customexception;

public class Main {

	public static void main(String[] args) {
		
		Banking bank = new Banking();
		
		try {
			bank.withdraw(1000,500);
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
