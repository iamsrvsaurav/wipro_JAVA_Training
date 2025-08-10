package lambdaex1;
interface Intf1{
	void add(int x,int y);
}
public class Main2 {

	public static void main(String[] args) {
		//Intf1 i = (int x,int y) -> {System.out.println(x+y);};
		Intf1 i = (a,b) -> {System.out.println(a+b);};
		i.add(12,23);

	}

}
