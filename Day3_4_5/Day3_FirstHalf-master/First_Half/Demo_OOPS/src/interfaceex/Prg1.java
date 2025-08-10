package interfaceex;
interface Intf1{
	int x =12;
	void show();
}
class A implements Intf1{

	@Override
	public void show() {
		System.out.println("Show");
		
	}
	
}
public class Prg1 {

	public static void main(String[] args) {
		System.out.println(Intf1.x);
		Intf1 i = new A();
		i.show();
	}

}
