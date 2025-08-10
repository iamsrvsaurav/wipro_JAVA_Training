

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
	public static void main(String[] args) {
		Employee emp = new Employee(1,"Rakesh",51,1234);
		FileOutputStream file = null;
		ObjectOutputStream objectOut = null;
		try {
			file = new FileOutputStream("serialize.txt");
			objectOut = new ObjectOutputStream(file);
			objectOut.writeObject(emp);
			objectOut.flush();
			objectOut.close();
			file.close();
		}catch(FileNotFoundException ex) {
			System.out.println(ex);
		}catch(IOException ex) {
			System.out.println(ex);
		}
		
		
	}
}
