import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number=0;
		int reverse=0;
		int numcopy=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		number = sc.nextInt();
		numcopy = number;
		while(numcopy>0)
		{
			int digit = (numcopy%10);
			numcopy = numcopy/10;
			reverse = (reverse*10)+digit;
		}
		if(number == reverse)
		{
			System.out.println("The number is palindrome number");
		}
		else
		{
			System.out.println("The number is not a palindrome number");
		}
		sc.close();
	}

}
