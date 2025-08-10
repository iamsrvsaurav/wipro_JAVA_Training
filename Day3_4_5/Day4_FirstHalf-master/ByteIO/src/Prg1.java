
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Prg1 {

	public static void main(String[] args) {
		StringBuffer content = null;
		FileInputStream fileStream = null;
		File file = null;
		int ch;
		try {
		file = new File("demo.txt");
		fileStream = new FileInputStream(file);
		//fileStream = new FileInputStream("demo1.txt");
		content = new StringBuffer();
		while((ch=fileStream.read()) != -1) {
			content.append((char)ch);
		}
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			System.out.println(content);
			try {
			fileStream.close();
			}catch(IOException e) {
				System.out.println(e);
			}
		}
		

	}

}