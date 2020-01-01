import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int n,sum=0,temp,r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		n = sc.nextInt();
		
		temp = n;
		
		while(temp!=0)
		{
			r=temp%10;
			sum=sum+(r*r*r);
			temp = temp/10;
		}
		if(n==sum)
		{
			System.out.println("Entered number is a Amstrong number");
		}
		else
		{
			System.out.println("Entered number is not a Amstrong number");
		}
		sc.close();
	}
}

