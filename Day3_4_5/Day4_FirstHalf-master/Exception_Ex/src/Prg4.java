import java.util.Scanner;

public class Prg4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First No:");
		int x = sc.nextInt();
		System.out.println("Enter Second No:");
		int y = sc.nextInt();
		int result = 0;
		int[] arr = new int[2];
		
		try {
			result = x/y;
			arr[3] = sc.nextInt();
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
		
		System.out.println(result);
		System.out.println("Hello");

	}

}
