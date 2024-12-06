//Assignment 27
//i)Write a program to check if a given string is a palindrome.
 //String dr1= "rotator"
 
// ii)Check if two strings are equal
      //  String s1 = "Java"
        //String s2 = "java"
                
//iii)dispaly the trimmed string from the original 
//string "  A very Good Morning !  "



package build;

public class Stringfunction2 {

	public static void main(String[] args) {
		String dr1= "rotator";
		if(dr1.endsWith(dr1))
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
		
		String s1 = "Java";
		  String s2 = "java";
		  System.out.println(s1.equals(s2));
	String v1="     A very Good Morning !        ";
	System.out.println(v1);
	System.out.println(v1.trim());
	}

}
