package JAVA;

public class stringarray {

	public static void main(String[] args) {
		String s="WELCOME";
		System.out.println(s.length());
		//concatation
		String s1="WELCOME TO";
		String s2="TRANING";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
//equals
		String s3="WELCOME";
		String s4= "welcome";
		System.out.println(((s).equals(s4)));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//contains
		s3.contains("WEL");
		s4.contains("ab");
		//substring
		System.out.println(s.substring(0,3));
		System.out.println(s.substring(2, 5));
		s.substring(4,7);
		//replace
		System.out.println(s.replace('w', 'k'));
		System.out.println(s.replace("come", "den"));
		System.out.println(s.replace(s3, s4));
		
	}

}
