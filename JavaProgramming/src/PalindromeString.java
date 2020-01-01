import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		String original,reverse="";
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the String:");
		
		original = sc.nextLine();
		
		int length = original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("Entered String is Palindrome:"+reverse);
		}
		else
		{
			System.out.println("Entered String is not a Palindrome:"+reverse);
		}
		sc.close();

	}

}
