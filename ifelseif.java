package build;

public class ifelseif {
	public static void main(String[] args) {
		int a = 100;
		int b = 90;
		int c = 80;
		int d = 70;
		int e = 60;
		int f = 50;
		if (a != b) {
			System.out.println("if marks is 100to90 then grade is A+");
		} else if (b != c) {
			System.out.println("if marks is 90to80 then grade is A");
		} else if (c != d) {
			System.out.println("if marks is 80to70 then grade is B");
		} else if (d >= e) {
			System.out.println("if marks is 70to60 then grade is C");
		}

		else {
			System.out.println("if marks is 60to50 then grade is fail");
		}

	}
}
