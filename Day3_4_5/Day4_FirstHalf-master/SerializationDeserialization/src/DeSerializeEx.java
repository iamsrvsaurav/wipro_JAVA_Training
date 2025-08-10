
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeEx {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Employee emp = null;
		try {
			fis = new FileInputStream("serialize.txt");
			ois = new ObjectInputStream(fis);
			emp = (Employee)ois.readObject();//Type cating from object class to employee class
			ois.close();
			fis.close();
		}catch(FileNotFoundException ex) {
			System.out.println(ex);
		}catch(IOException ex) {
			System.out.println(ex);
		}catch(ClassNotFoundException ex) {
			System.out.println(ex);
		}
		System.out.println(emp);
	}

}
