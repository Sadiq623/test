
public class DuplicateCharacters {

	public static void main(String[] args)
	{
		String str = "w3schools";
		
		char[] inp = str.toCharArray();
		
		System.out.println("Duplicate Characters:");
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(inp[i]==inp[j])
				{
					System.out.println(inp[j]);
					break;
				}
			}
		}
	}
}