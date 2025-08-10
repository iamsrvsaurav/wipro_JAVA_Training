
import java.io.FileWriter;
import java.io.IOException;

public class Prg2 {

	public static void main(String[] args) {
		FileWriter fileWriter = null;
		String data = "The information is to be written to the file";
		try {
		//fileWriter = new FileWriter("c:\\myfile\\file2.txt");
			fileWriter = new FileWriter("file2.txt");
		fileWriter.write(data);
		System.out.println("The information is written to the file");
		}catch(IOException ex) {
			System.out.println(ex);
		}finally {
			try {
			fileWriter.close();
			}catch(IOException ex) {
				System.out.println(ex);
			}
		}

	}

}
