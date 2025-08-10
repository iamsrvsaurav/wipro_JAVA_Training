
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Prg2 {

	public static void main(String[] args) {
		Scanner scanner = null;
		FileOutputStream fileOutput = null;
		File file = null;
		scanner = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = scanner.nextLine();
		try {
		file = new File("demo1.txt");
		//fileOutput = new FileOutputStream("demo2.txt");
		fileOutput = new FileOutputStream(file);
		byte[] buffer = new byte[100];
		buffer = name.getBytes();
		fileOutput.write(buffer);
		System.out.println("Content written to the file");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
			fileOutput.close();
			}catch(IOException e) {
				System.out.println(e);
			}
		}
		

	}

}
