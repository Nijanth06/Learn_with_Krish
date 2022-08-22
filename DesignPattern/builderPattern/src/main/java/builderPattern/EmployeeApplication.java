package builderPattern;

import builderPattern.Employee.Builder;

public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee.Builder builder = new Employee.Builder("Nijanth");
		Builder employee= builder.age(25).address("Muhavil").phone("123456");
		System.out.println(employee);

		
		Employee.Builder builder1 = new Employee.Builder("loku");
		Builder employee1= builder1.age(25).address("Muhavil");
		System.out.println(employee1);
	}

}
