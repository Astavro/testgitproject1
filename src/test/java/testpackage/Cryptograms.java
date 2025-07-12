package testpackage;

public class Cryptograms {

	public static StringBuilder Str;
	public static StringBuilder crypString;
	
	public Cryptograms(StringBuilder str1, StringBuilder str2) {
		Str = str1;
		crypString = str2;
		
		int CrypNumber = 112;
		
		char newString = (char)(CrypNumber + 5);
		
		crypString.setCharAt(0, newString);
	} 
	
	
	
	public StringBuilder getOriginalStr() {
		return Str;
	}
	
	public StringBuilder getCrupStr() {
		return crypString;
	}
}
