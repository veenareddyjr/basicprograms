
/*Assignment 34
Write a program for the below.The given String= "myJava"

i)check if the given string is consists of the exact 6 letters?
ii)check if the String starts with 'm' ?
iii)check if the String ends with 'y' ? */
package build;

public class Array5 {

	public static void main(String[] args) {
		
		String a1= "myJava";
		boolean b1=a1.matches("......");
		System.out.println(b1);
		System.out.println(a1.matches("m...(.*)"));
		System.out.println(a1.matches("(.*)...y"));
	}

}
