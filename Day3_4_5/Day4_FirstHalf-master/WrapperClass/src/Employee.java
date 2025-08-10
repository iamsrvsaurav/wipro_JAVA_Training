
public class Employee {
	
	//Singleton design pattern
	//Factory method pattern
	
	private Employee() {
		
	}
	
	public static Employee retObj() {
		return new Employee();
	}
	
	public void display() {
		System.out.println("Display");
	}

}
