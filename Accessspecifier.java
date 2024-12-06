package build;

public class Accessspecifier {
	
	public static void add()
	{
		System.out.println("add");
		
	}
	private static void sub()
	{
		System.out.println("sub");
		
	}
static void mul()
{
	System.out.println("mul");	
}
protected static void div()
{
	System.out.println("div");		
}
	public static void main(String[] args)
	{
		Accessspecifier.add();
		Accessspecifier.sub();
		Accessspecifier.mul();
		Accessspecifier.div();
	}

}
