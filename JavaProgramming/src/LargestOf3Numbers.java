import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		
		int a = sc.nextInt();
		
        System.out.println("Enter the second number");
		
		int b = sc.nextInt();
		
        System.out.println("Enter the third number");
		
		int c = sc.nextInt();
		
		
		/*Approach1
		
		if(a>b && a>c)
		{
			System.out.println(a+" is largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is largest number");
		}
		else
		{
			System.out.println(c+" is largest number");
		}
			sc.close();	*/
		/*
		 * Approach 2 Ternary Operator
		 */
		//int largest1 = a>b?a:b;
		
		//int largest2 = c>largest1?c:largest1;
		
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest+"is largest number");
		
		sc.close();
	}

}
