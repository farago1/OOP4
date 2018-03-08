
public class Main {

	public static void main(String[] args) {
//		Employee employee= new Employee();
//
//		employee.employeeName="Joe";
//		employee.salary=1000;
//		
//		employee.setEmployeeName("Leonard");
//		employee.setSalary(1000);
//
//		employee.salary= employee.increaseSalary(500, employee.salary);
//		System.out.println(employee.displayInfo(employee.salary, employee.employeeName));
//		
//		Employee employee2= new Employee();
//		
//		employee2.setEmployeeName("Richard");
//		employee2.setSalary(2000);
//		
//		System.out.println(employee.displayInfo()+"\n"+employee2.displayInfo());
//		System.out.println(employee.isInSalaryRange(500, 3000));
//		System.out.println(employee.getTax());
//		System.out.println(employee.higherSalary(employee2));
//		
		Employee[] employeeArray= new Employee[10];
		for (int i = 0; i < employeeArray.length; i++) {
			employeeArray[i]= new Employee();
			employeeArray[i].setSalary(i*1200);
			employeeArray[i].setEmployeeName("John"+i);
		}
		
		int maxSIndex = 0;
		for (int i = 1; i < employeeArray.length; i++) {
			if (employeeArray[i].higherSalary(employeeArray[maxSIndex])) {
				maxSIndex = i;
			}	
		}
		System.out.println("highest salary index: "+ maxSIndex);
		
		long salaryStart = 500;
		long salaryEnd = 6000;
		int nBetween = 0;
		for (int i = 0; i < employeeArray.length; i++) {
			if (employeeArray[i].isInSalaryRange(salaryStart, salaryEnd)) {
				nBetween++;
			}
		}
		System.out.println("salaries between "+salaryStart+" and "+salaryEnd+": "+nBetween);
		
		long avgSalary = 0;
		for (int i = 0; i < employeeArray.length; i++) {
			avgSalary += employeeArray[i].getSalary();
		}
		avgSalary = avgSalary/employeeArray.length;
		System.out.println("average salary: "+avgSalary);
		
		long sumTax = 0;
		for (int i = 0; i < employeeArray.length; i++) {
			sumTax += employeeArray[i].getTax();
		}
		System.out.println("total tax: "+sumTax);
		
		
	}
}
