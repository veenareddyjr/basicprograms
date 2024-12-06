package build;

public class Variable {
	final static int no1 = 1000;
	static double m = 688.09;
	static String k = "veena";
	static long p = 45677;

	static void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}

	static void sub() {
		double q1 = 45.99;
		double q2 = 670.70;
		double q3 = q2 - q1;
		System.out.println(q3);
	}

	public static void main(String[] args) {
		System.out.println(p);
		System.out.println(m);
		System.out.println(k);
		add();
		sub();
		{
			no1();
		}
	}

	static void no1() {
		System.out.println(no1 * 10);

	}

}
