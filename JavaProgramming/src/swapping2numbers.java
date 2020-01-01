
public class swapping2numbers {

	public static void main(String[] args) {
		
		int a=10, b=20; //temp; using temp variable
		
		System.out.println("Before Swapping is:"+a+" "+b);
		
		/*Logic 1    using temp variable
		  temp = a;
		  a=b;
		  b=temp;*/
		
		
		/*Logic 2    using + and - without using third variable
		a=a+b; //10+20=30
	    b=a-b; //30-20=10
	    a=a-b; //30-10=20*/
	    
	    
	    //Logic 3 //using * and / - without using third variable
	    //A and B values should not be zero
		
		/*a=a*b;  //10*20=200
		b=a/b;  //200/20=10
		a=a/b;  //200/10=20*/
		
		//Logic 4 Bitwise operator
		/*a=a^b; //10^20=30
		b=a^b; //30^20=10
		a=a^b; //30^10=20*/
		
		//Logic 5 Single Statement strat executing from right
		//a=10 b=20
		b=a+b-(a=b);
		
		System.out.println("After Swapping is:"+a+" "+b);

	}

}
