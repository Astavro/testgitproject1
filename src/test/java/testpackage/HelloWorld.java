package testpackage;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println(myFunc(0));
		System.out.println(myFunc(1));
		
		System.out.println(concat("Go ", "Antoine"));
	}

	public static String myFunc(int x) {
		
		
		if(x == 0)
			return "Yes";
		else
			return "No";
	}
	
	public static String concat(String str1, String str2) {
		return str1 + str2;
	}
}
