import java.util.Scanner;

public class Prg5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First No:");
		int x = sc.nextInt();
		System.out.println("Enter Second No:");
		int y = sc.nextInt();
		int result = 0;
				
		try {
			result = x/y;
		}catch(ArithmeticException ex) {
			//System.out.println(ex);
			ex.printStackTrace();
		}finally {
			System.out.println("Finally");
		}
		
		System.out.println(result);
		System.out.println("Hello");
	}

}
