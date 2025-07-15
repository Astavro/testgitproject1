package Project_Euler;

import java.util.Scanner;

public class multipleOf3or5 {

	public static void main(String[] args) {
		

		
		System.out.println("Sum of all Multiples: " + sumOfAllMultipleNumbers(userInput()));

	}
	
	/***
	 * This function requests a value from the user.
	 * 
	 * @return
	 * 		returns a integer value
	 */
	public static int userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int multiple = sc.nextInt();	
		
		return multiple;
	}
	
	/***
	 * This function will calculate the sum of all values that are multiples of 3 or 5. 
	 * 
	 * @param num - Integer value 
	 * @return sum - all values that are multiples of 3 or 5
	 */
	public static int sumOfAllMultipleNumbers(int num) {
		int sum = 0;
		
		for (int i=2;i<num;i++)
		{
			if (i%3 == 0 || i%5==0)
			{
				sum = sum + i;
			}
		}
		
		return sum;
	}

}
