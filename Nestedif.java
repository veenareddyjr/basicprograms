package build;

public class Nestedif {
	public static void main(String []args) {
		int a=18;
		int b=55;
		if(a<=b)
		{
			System.out.println("weight is 18 age is 55");
			if(b>=a)
			{
				System.out.println("age is 18 weight is 55");
		}
			if(b>a)
			{
				System.out.println("age is 18 weight less than the 55");
		}
			if(a<b)
			{
				System.out.println("age is less than 18 weight is 55");
		}
	}
		
		else {
			System.out.println("age is 18 weight is 55");
			if(b<=a)
			{
				System.out.println(" weight is less than age ");	
			}
		}
		}

}
