package coll2_generic;

class Myclass<T>{
	T x;
}
public class Prga {

	public static void main(String[] args) {
		Myclass<Integer> i = new Myclass<>();
		
		Myclass<String> j = new Myclass<>();
		
		i.x = 123;
		j.x = "Hello";
		
		System.out.println(i.x+","+j.x);

	}

}
