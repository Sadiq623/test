
public class ComparingTwoStrings {

	public static void main(String[] args) {
		
		String a = "Avatar";
		
		String b = "avatar";
		
		if(a.equals(b))
		{
			System.out.println("Both strings are Equal");
		}
		else
		{
			System.out.println("Both are strings are not Equal");
		}

		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Both strings are Equal");
		}
		else
		{
			System.out.println("Both are strings are not Equal");
		}

	}

}
