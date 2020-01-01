
public class DuplicateElementsinArray {

	public static void main(String[] args) {
		
		boolean flag = false;
		
		String arr[] = {"Java","C","Python","Groovy","Java"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Element Found:"+arr[i]);
					flag = true;
				}
			}
		}
		if(flag == false)
		{
			System.out.println("Duplicate Elements not Found");
		}
		
	}

}
