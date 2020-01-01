import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int fact = 1;
		int number = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		number = sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			fact = fact*i;	
		}
		System.out.println("Factorial of a number is:"+fact);
		sc.close();
	}

}
