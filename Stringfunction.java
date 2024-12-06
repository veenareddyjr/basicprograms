//Assignment 25
//Write a java program on String functions for the following :
//Here, the String = " I Love MySelf"

//a)Find the length of the given String.
//b)Convert the String to upper case and lower case.
//c)Remove all white spaces from String.
//d)Reverse the given string using loops.






package build;

public class Stringfunction {

	public static void main(String[] args) {
		
		String a5="         I Love MySelf       ";
		String trimmedString = a5.trim();
		System.out.println(trimmedString);
		System.out.println(a5.trim());
		String a="I Love MySelf";
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String a2="I Love MySelf";
	
		for(int i=10;i>=0;i--) {
		
		
	System.out.print(a2.charAt(i));
			
		}

	}

}
