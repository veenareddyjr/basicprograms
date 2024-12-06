package build;
class One
{
	One()

	{
		System.out.println("condition2");
	}
}
public class Superkeyword extends One
{
 Superkeyword()
 {
	//super();
	System.out.println("condition1");
}
	public static void main(String[] args)
	{
		
		new Superkeyword();
		}
	}
