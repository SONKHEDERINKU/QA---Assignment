package JAVA;

public class StaticExample {
	int a;
	static int b;
	static void m1()
	{
		System.out.println("this is m1 static method");
		
	}
	void m2()
	{
		System.out.println("this is m2 non static method");
	}
	void m3()
	{
		a=500;
		b=1000;
		m1();
		m2();
	}
public static void main(String[]args)
{
   b=100;
   System.out.println(b);
   m1();
  StaticExample se = new StaticExample();
  se.a=200;
  System.out.println(se.a);
  se.m2();
  
}
}
