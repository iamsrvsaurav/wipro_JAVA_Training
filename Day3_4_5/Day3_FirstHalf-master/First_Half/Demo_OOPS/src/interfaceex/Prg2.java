package interfaceex;
interface intf2{
	void show();
}
interface intf3{
	void print();
}

class xyz{
	
}

class A2 extends xyz implements intf2,intf3 {

	@Override
	public void print() {
		System.out.println("Print");
		
	}

	@Override
	public void show() {
		System.out.println("Show");
		
	}
	
}
public class Prg2 {

	public static void main(String[] args) {
		A2 obj = new A2();
		obj.print();
		obj.show();

	}

}
