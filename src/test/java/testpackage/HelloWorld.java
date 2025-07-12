package testpackage;

public class HelloWorld {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Practice what you preach, stay hard");
		Cryptograms crg = new Cryptograms(sb,sb);
		
		System.out.println(crg.getOriginalStr());
		System.out.println(crg.getCrupStr());
		
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
