import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		/*1.int number=0,reverse=0;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number to reverse:");
		
		number = sc.nextInt();
		
		sc.close();
		
		while(number!=0)
		{
			reverse = (reverse*10) + (number%10);
			number = number/10;
		}
		
		System.out.println("Reversed Number is:"+reverse);*/
		
		
		/* 2.Using StringBuffer

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to reverse:");
		
		int num = sc.nextInt();
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("Result is:"+rev);
		sc.close(); */
		
		/* 3 Using StringBuilder class
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse:");
		int num = sc.nextInt();
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("Result is:"+rev);
		sc.close();
	}

}
