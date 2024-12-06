/* replace()
Assignment 33
Write a program for the below.here, String input= "Hello! 123Bye 789 "

i) Replace all numeric characters in a given string with an empty string ("").
ii)Replace all capital letters in a given string with an empty string ("").
iii)Replace all lower letters in a given string with an empty string ("").
iv)Replace the letter 'e' with 'y'*/



package build;

public class Array4 {

	public static void main(String[] args) {
		String a= "Hello! 123Bye 789 ";
		System.out.println(a.replace('e', 'y'));
		
		
		String a2= "Hello! 123Bye 789 ";
		System.out.println(a2.replaceAll("[0-9]", ""));
		
		String a3= "Hello! 123Bye 789 ";
		
	System.out.println(	a3.replaceAll("[A-Z]", ""));
			String a4= "Hello! 123Bye 789 ";
			
	System.out.println(a4.replaceAll("[a-z]", ""));
		
	}

}
