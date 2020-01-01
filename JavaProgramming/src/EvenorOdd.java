import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
	
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		x = sc.nextInt();
		
		if(x%2==0)
		{
			System.out.println("This is a Even Number");
		}
		else
		{
			System.out.println("This is a Odd Number");
		}
          sc.close();
	}

}
