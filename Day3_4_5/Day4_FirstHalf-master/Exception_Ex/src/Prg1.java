import java.util.Scanner;

public class Prg1 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First No:");
	int x = sc.nextInt();
	System.out.println("Enter Second No:");
	int y = sc.nextInt();
	
	int result = x/y;
	
	System.out.println(result);
	System.out.println("Hello");
  }
}
