package build;

public class Methodoverloading {
	
	static void add()
	{
		
		System.out.println("addition");
	}
   void add(int a,double b)
   {
	   double c=a+b;
	   System.out.println(c);
   }
	   static void add(int a,int b)
	   {
		   int c=a+b;
		   System.out.println(c);  
	   }
	   
   
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		add(77,88);
		add();
		Methodoverloading m1=new Methodoverloading();
		m1.add(66, 8.00);
		
		
		
		
}
	
	

}
