package finalex;

class A{
	public void show() {
		System.out.println("Show in A");
	}
}

class B extends A{
	public final void show() {
		System.out.println("Show in B");
	}
}

/*class C extends B{
	public void show() {
		System.out.println("Show in C");
	}
}*/

public class Prg2 {

	public static void main(String[] args) {
		//C obj = new C();
		//obj.show();

	}

}
