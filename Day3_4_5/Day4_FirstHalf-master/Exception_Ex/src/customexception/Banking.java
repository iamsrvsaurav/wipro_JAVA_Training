package customexception;

public class Banking {
	
	public void withdraw(long withdrawAmt,long balanceAmount) throws InsufficientFundException {
		if(balanceAmount < withdrawAmt) {
			throw new InsufficientFundException("Sorry! you have not sufficient fund");
		}
		else {
			System.out.println("Amount:"+withdrawAmt+",Withdrawn");
		}
	}

}
