import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		String name = "";
		
		name = br.readLine();
		System.out.println(name);
	}

}
