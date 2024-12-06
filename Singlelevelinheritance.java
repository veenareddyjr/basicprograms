package build;
class Parentclass{
	static void add()
	{
		int a=90;
		int v=60;
		int c=v+a;
		System.out.println(c);
	}
}
public class Singlelevelinheritance extends Parentclass
{
 void sub()
{
	double q=22;
	double u=33;
	double t=q-u;
	System.out.println(t);
}
	public static void main(String[] args) 
	{
		Singlelevelinheritance s1=new Singlelevelinheritance();
		add();
		s1.sub();

	}

}
