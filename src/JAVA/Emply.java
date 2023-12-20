package JAVA;

public class Emply {
	int empid;
	String empname;
	int salary;
	int deptno;
	//define object  by using constructor 
	/*Emply(int id,String name,int sal,int dno)
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
	}*/
	void setdata(int id,String name,int sal,int dno)
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;	
	}
	
void display()
{
	System.out.println(empid);
	System.out.println(empname);
	System.out.println(salary);
    System.out.println(deptno);
    
}
public static void main(String args[]){
	
	/*Emply empl1= new Emply(100,"pooja",15000,45);
	empl1.display();
	Emply empl2 = new Emply(200,"rajeev",20000,65);
	empl2.display();*/
	
	//Assign values to class variables using Method
	Emply empl= new Emply();
	empl.setdata(101,"Raj",2000,10);
	empl.display();
	
	Emply empl1= new Emply();
	empl1.setdata(102,"ratan",10000, 52);
	empl1.display();
	
	
}
}
