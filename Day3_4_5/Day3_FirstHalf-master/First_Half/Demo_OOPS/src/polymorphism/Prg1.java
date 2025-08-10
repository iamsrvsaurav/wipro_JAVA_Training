package polymorphism;

public class Prg1 {
	
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	
	public void add(double x,double y) {
		System.out.println(x+y);
	}
	
	public void add(String x,String y) {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		Prg1 obj = new Prg1();
		obj.add(12,23);
		obj.add(12.34567,22.56789);
		obj.add("Hello","World");
	}

}
