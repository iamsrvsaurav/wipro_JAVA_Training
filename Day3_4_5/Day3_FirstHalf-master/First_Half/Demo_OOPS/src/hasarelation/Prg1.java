package hasarelation;

public class Prg1 {

	public static void main(String[] args) {
		Department dept = new Department("Sales");
		Employee emp = new Employee(101,"Rakesh Srivastaw",dept);
		
		System.out.println(emp);

	}

}
