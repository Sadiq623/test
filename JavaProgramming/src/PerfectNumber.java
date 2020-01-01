import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber {

	public static void main(String[] args) throws IOException {
	
		int n,s=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number:");
		
		n=Integer.parseInt(br.readLine());
		
		for(int x=1;x<n;x++)
		{
			if(n%x==0)
			{
				s=s+x;
			}
		}
		if(s==n)
		{
			System.out.println("This is a Perfect Number");
		}
		else
		{
			System.out.println("This is a not a Perfect Number");
		}
	}
}