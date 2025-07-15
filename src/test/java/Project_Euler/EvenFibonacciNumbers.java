package Project_Euler;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		int m = 4000000;
			
		System.out.println("Sum of all even Fibonacci values: " + sumOfEvenFibonacciValues(m));
	}
	
	public static int sumOfEvenFibonacciValues(int max) {
		
		int sum = 2;
		
		int[] arr =new int[max];
		arr[0] = 1;
		arr[1] = 2;
		
		for (int i=2; i<max;i++) {
			arr[i] = arr[(i-1)] + arr[(i-2)];
			
			if(arr[i] > 4000000) {
				break;
			}
			
			if (arr[i]%2 == 0)
				sum = sum + arr[i];
		}
		
		return sum;
	}

}
