package JAVA;

public class objectArray {
//single dimensional array
	public static void main(String[] args) {
		Object a[]=new Object[5];
		a[0]=10;
		a[1]=20.5;
		a[2]="welcome";
		a[3]='G';
		a[4]=true;
		 
		//Object a[]= {100,345,678,"welcome",'A',true,300,506.66);
		
		for(Object i:a)
		{
			System.out.println(i);
		}

	}

}
