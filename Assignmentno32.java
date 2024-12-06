/*Assignment 32
a)find the output for the given string by using 'equals()'
and 'equalsIgnoreCase()' String methods?

b)Write a program that uses the 'contains()'method 
in the string class to check if the substrings: "Java" 
and "Python" are present in the string? 
 where String name = "Java programming is awesome!"*/
 


package build;

public class Assignmentno32 {

	public static void main(String[] args) {
		
		String name = "Java programming is awesome!";
		System.out.println(name.concat("good"));
		String a1="JAVA";
		String a2="Python";
		
		boolean b1=a1.equals(a2);
		System.out.println(b1);
		boolean b2=a1.equalsIgnoreCase(a2);
		System.out.println(b2);
		String a = "Java programming is awesome!";
		boolean b3=a.contains("programming ");
		System.out.println(b3);
	}

}
