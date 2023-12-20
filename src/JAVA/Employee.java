package JAVA;

public class Employee {
	int empid;
	String empname;
	int salary;
	int deptno;
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
		
	}
	//value assign using Object 
	
	public static void main(String[] args) {
		Employee empl=new Employee();
		
		empl.empid=10;
		empl.empname="Raju";
		empl.salary=10000;
		empl.deptno=10;
		empl.display();
	Employee empl2=new Employee();
	empl2.empid=20;
	empl2.empname="rinku";
	empl2.salary=1000;
	empl2.deptno=15;
	empl2.display();

	}

}
