
public class FindTwoMaxValues {
	
	/*public void GetTwoMaxValues(int [] nums)
	{
		int max_one = 0;
		int max_two = 0;
		   for(int n:nums)
		    {
			if(max_one<n)
			{
				max_two = max_one;
				max_one = n;
			}
			else if(max_two<n)
			{
				max_two =n;
			}
		}
		System.out.println("Max1 is:"+max_one);
		System.out.println("Max2 is:"+max_two);
	}
		public static void main(String[] args)
		{
			int list[] = {23,56,89,45,32,76,54};
			FindTwoMaxValues max = new FindTwoMaxValues();
			max.GetTwoMaxValues(list);
			
		}*/
	
	public void GetOneMaxValue(int [] nums)
	{
		int max_one = 0;
		
		for(int n:nums)
		{
			if(max_one<n)
			{
				max_one = n;
			}
		}
		System.out.println("Max1 is:"+max_one);
	}
	public static void main(String[] args)
	{
		int list[] = {45,76,89,45,67,34};
		
		FindTwoMaxValues max = new FindTwoMaxValues();
		
		max.GetOneMaxValue(list);
	}
	}


