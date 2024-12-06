package build;

public class Methodoverloadingnonstaticmethods {
	
	
	void Rangareddy() {
		System.out.println("dughter veenareddy");
	}
	void motor() {
		System.out.println("Activa");
		
	}
	void price(long a)
	{
	long activeprice=a;
	System.out.println(a);
	}
	public static void main(String[] args) {
		Methodoverloadingnonstaticmethods a1=new Methodoverloadingnonstaticmethods();
	a1.Rangareddy();
	Methodoverloadingnonstaticmethods a2=new Methodoverloadingnonstaticmethods();
	a2.motor();
	Methodoverloadingnonstaticmethods a3=new Methodoverloadingnonstaticmethods();
	a3.price(1000000);
		
		
	}

}
