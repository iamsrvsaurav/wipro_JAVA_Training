package ex;
//Annonymous method means method without name

interface Intf3{
	void show();
}

public class Main3 {
	public static void main(String[] args) {
		Intf3 i = new Intf3() {
			public void show() {
				System.out.println("Show");
			}
		};
		i.show();
	}

}
