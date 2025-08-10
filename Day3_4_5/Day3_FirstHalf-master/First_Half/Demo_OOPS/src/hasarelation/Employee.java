package hasarelation;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private Department dept;
	public Employee() {
		
	}
	public Employee(int employeeId, String employeeName, Department dept) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dept = dept;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dept=" + dept + "]";
	}
	
	
	

}
