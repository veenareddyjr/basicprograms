
//Assignment 26
//i)Find the index of a character 'c' in a given string.
//String a1 = "Welcome India"

//ii)Retrieve the character at index '4'in a given string.
//String str = "Programming "

//iii)Concatenate two strings.
  //  String str1 = "Hello,"
  //  String str2 = "World"
        
//iv)Extract a substring from the index '11' to the end of the string.
//String name = "Welcome to Java Programming"

//v)Extract a substring from index 0 to 11
//String P1 = "Programming is fun"

package build;

public class Stringfunction1 {

	public static void main(String[] args) {
		String a="Welcome India";
		System.out.println(a.indexOf('c'));
		String b = "Programming";
		System.out.println(b.indexOf('r'));
		String a1 = "Hello";
		String a2 = "World";
		System.out.println(a1.concat(a2));
		String name = "Welcome to Java Programming";
		System.out.println(name.substring(11));
		System.out.println(name.substring(0, 15));
		String P1 = "Programming is fun";
		System.out.println(P1.substring(0, 11));
	}

}
