package build;

public class Constuctor {
	Constuctor(String a)
	{
		System.out.println("employee name veena");
	}
	Constuctor(int b){
		System.out.println("employee_id 77456");
	}
	Constuctor(String c, long d, String e){
		System.out.println("employee_company is inube ,designation QA ,salary ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Constuctor("veena");
		new Constuctor(24);
		new Constuctor("inube",77709900,"QA");
		

	}

}
