/*Assignment 35
i)Write a program to split the string "Java is fun" into individual words.
ii)Split the string "Java Python C++" using a comma.
iii)Split the string "Java is fun to learn" into at most 3 parts.
iv)Write a program to split a sentence into words,
 count the words, and print them.*/



package build;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		
		String  name="Java is fun";
		String[]a1=name.split(" ");
			
	System.out.println(Arrays.toString(a1));
	
	String name1="Java Python C++";
	String[]a2=name1.split(",");
	
   System.out.println(Arrays.toString(a2));
	
		String name2="Java is fun to learn";
		String[]a3=name2.split("a",0);
		
	System.out.println(Arrays.toString(a3));
	
	String name3="i am veena reddy";
	String[]a4=name3.split(" ");
	
	System.out.println(Arrays.toString(a4));
	
System.out.println("number of word count is"+a4.length);

	
	}

}
