
public class Employee {
	
	private String employeeName;
	private long salary;
	
	public long increaseSalary (long increase, long salary) {
		return salary+=increase;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String displayInfo() {
		return "Salary: "+this.salary+" Name: "+this.employeeName;
	}

	public boolean isInSalaryRange(long salaryStart, long salaryEnd) {
		if (salaryStart<=this.salary && this.salary<salaryEnd) {
			return true;
		} else return false;
	}
	
	public long getTax() {
		return (long)(this.salary*0.16);
	}
	
	public boolean higherSalary(Employee employee) {
		if (this.salary > employee.salary) {
			return true;
		} else return false;
	}
	
}
