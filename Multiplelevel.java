package build;

class One1
{
	static void add()
	{
		System.out.println("add");
	}
	static void sub()
	{
		System.out.println("sub");
	}
	
}
class Two2 extends One1
{
	void mul()
	{
		System.out.println("mul");
	}
	void mod()
	{
		System.out.println("mod");
	}
}
public class Multiplelevel  extends Two2
{
	static void div()
	{
		System.out.println("div");
	}

	public static void main(String[] args) {
		
Two2 t1=new Two2 ();
t1.mul();
t1.mod();
add();
sub();
div();
	}

}
