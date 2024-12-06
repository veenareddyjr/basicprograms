package build;

public class Methodoverloadingstaticmethod {
	
	static void main(int a,long c) {
		
		long v=c+a;
		System.out.println(v);
		
	}
	static void name() {
		System.out.println("subramanian");
	}
	
	public static void main(String[] args) {
		main(88,5567876);
		name();

}
}
