
import java.io.Serializable;
//Serializable interface is marker interface
public class Employee implements Serializable{

	int empId;
	String empName;
	int age;
	transient int pin;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, int age, int pin) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", pin=" + pin + "]";
	}
	
	

}
