package testpackage;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println(myFunc(0));
		System.out.println(myFunc(1));
	}

	public static String myFunc(int x) {
		
		
		if(x == 0)
			return "Yes";
		else
			return "No";
	}
}
