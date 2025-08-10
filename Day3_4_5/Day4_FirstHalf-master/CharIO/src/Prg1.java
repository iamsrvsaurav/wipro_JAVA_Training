
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prg1 {

	public static void main(String[] args) {
		FileReader reader = null;
		int chars;
		StringBuffer sb = new StringBuffer();
		try {
		reader = new FileReader("file1.txt");
		while((chars = reader.read()) != -1) {
			sb.append((char)chars);
		}
		System.out.println(sb);
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
			reader.close();
			}catch(IOException ex) {
				System.out.println(ex);
			}
		}

	}

}
