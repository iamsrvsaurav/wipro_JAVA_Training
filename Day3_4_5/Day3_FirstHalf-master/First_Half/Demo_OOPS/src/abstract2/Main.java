package abstract2;

import abstraction1.BangloreOffice;
import abstraction1.ChennaiOffice;

public class Main {

	public static void main(String[] args) {
		BangloreOffice o1 = new BangloreOffice();
		o1.verifyingDocument();
		o1.issuingPassport();
		
		ChennaiOffice o2 = new ChennaiOffice();
		o2.verifyingDocument();
		o2.issuingPassport();

	}

}
