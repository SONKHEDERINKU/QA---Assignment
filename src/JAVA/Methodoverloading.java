package JAVA;

public class Methodoverloading {

	
	int a;
	int b;
	
	//no parameter
	void sum()
	{
		a=10;
		b=20;
		System.out.println(a+b);
		
	}
	//2 parameter
	void sum(int x, double d)
	{
		int a=x;
		double b=d;
		System.out.println(a+b);
		
	}
	//3 parameter
void sum(int x,int y,int z)
{
	System.out.println(x+y+z);
}
public static void main(String[]args) {
	Methodoverloading mo= new Methodoverloading();
	mo.sum();
	mo.sum(100,200);
	mo.sum(10,30,40);
	
	
}

	}



