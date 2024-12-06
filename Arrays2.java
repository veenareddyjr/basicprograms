/*  
 
 	
Assignment 29
Write a progrm for the given strings, to check if the both arrays are equal to each other. 
here, String1: "kv no2 bangalore"
          String2: "karnataka" */







package build;

import java.util.Arrays;

public class Arrays2 {
	public static void main(String[] args) {
		String input ="kv no2 bangalore";
		String t1 =  "karnataka";
		char c1[]=input.toCharArray();
		char c2[]=t1.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
	}
}
