
public class MaxAndMinElementsInArray {

	public static void main(String[] args)
	{
	int a[] = {50,30,40,20,60};
	
	/*int max = a[0];
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max = a[i];
		}
	}
	System.out.println("Maximum value in Array is:"+max);*/
	
	int min = a[0];
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("Minimum value in Array is:"+min);
	}
}
