package lambdaex1;
interface Intf3{
	int add(int x,int y);
}
public class Main3 {

	public static void main(String[] args) {
		Intf3 i = (x,y) -> {return x+y;};
		System.out.println(i.add(12,23));
	}

}
