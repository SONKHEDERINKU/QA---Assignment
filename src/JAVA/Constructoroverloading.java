package JAVA;

public class Constructoroverloading {
 int a=0;
 int b=0;
  double c=0;
  Constructoroverloading()
  {
	  a=10;
	  b=20;
	  c=20.5;
  }
  Constructoroverloading(int x, int y)
  {
	  a=x;
	  b=y;
	 
  }
  Constructoroverloading(int x, double y)
  {
	  a=x;
	  c=y;
  }
  Constructoroverloading(int x, int y,double z)
  {
	  a=x;
	  b=y;
	  c=z;
  }
  void display()
  {
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
  }
	public static void main(String[]args) {
		//Constructoroverloading co= new Constructoroverloading();
		
		Constructoroverloading co = new Constructoroverloading(10,20);
		 co.display();
		
	}
}
