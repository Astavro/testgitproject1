package testpackage;

public class HelloWorld {

	public static void main(String[] args) {
		Cryptograms crg = new Cryptograms("Practice what you preach, stay hard");
		
		System.out.println(crg.getOriginalStr());
		
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
	
	public static void displayGoodMorningAntoine(String name) {
		System.out.println("Good Morning " + name);
	}
	
}
