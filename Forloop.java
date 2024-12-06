package build;

public class Forloop {
	public static void main(String[] args) throws InterruptedException   
	{
		for(int i=-100;i>=-150;i--)
		{
			Thread.sleep(2000);
			System.out.println(i);
		}
	}

}
