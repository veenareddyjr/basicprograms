	
//Assignment 31
//Write a program to check if the two given strings are Anagrams in JAVA?
//String 1 ="listen"
//String 2 ="silent"



package build;

import java.util.Arrays;

public class Arrayanagram {

	public static void main(String[] args) {
		String a1 ="listen";
		String a2 ="silent";
		char c1[]=a1.toCharArray();
		char c2[]=a2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
	boolean b1=Arrays.equals(c1,c2);
	if(b1==true)
	{
		
	System.out.println("the given2 string are anagram");
	}
	else
	{
		System.out.println("the given string are not anagram");	
	}


	}
}
