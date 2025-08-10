
public class Prg1 {

	public static void main(String[] args) {
		@SuppressWarnings("removal")
		Integer i = new Integer(123);
		Integer i1 = Integer.valueOf(12);
		System.out.println(i);
		System.out.println(i1);
		byte b1 = 12;
		@SuppressWarnings("removal")
		Byte b = new Byte(b1);
		System.out.println(b);
		
		@SuppressWarnings("removal")
		//Character c = new Character('x');
		Character c = Character.valueOf('c');
		System.out.println(c);
		
		@SuppressWarnings("removal")
		Boolean bool = new Boolean(true);
		System.out.println(bool);
	}

}
