
public class CountSumOfDigits {

	public static void main(String[] args)
	{
		int num = 12345;
		
		int sum=0;
		
		while(num>0)  //12 1
		{
			sum = sum+num%10; //4+3+2
			num = num/10;  //123 12 1 0
			
		}
		System.out.println("Sum of Digits is:"+sum);
	}
}
