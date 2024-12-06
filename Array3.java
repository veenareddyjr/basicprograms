/*Assignment 30
//Write a prog to find the below from the given string: " Hello! 123@ jAvA_"
//a)Number of alphabets used?
//b)Number of numeric used?
//c)Specail characters used?
//d)Spaces used?*/


package build;

import java.util.Arrays;


public class Array3 {
	
	static int countofalphabebet=0;
	static int countofDigit=0;
	static int countofspace=0;
	
	public static void main(String[] args) {
		
		String a= " Hello! 123@ jAvA_";
		char []c1=a.toCharArray();;
		
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			boolean b1= Character.isAlphabetic(c1[i]);
			if(b1==true)
			{
				countofalphabebet++;
			}
			boolean b2=Character.isDigit(c1[i]);
			
			if(b2==true)
			{
				countofDigit++;
			}
			boolean b3=Character.isSpace(c1[i]);
			if(b3==true)
			{
				countofspace++;
			}
			
		}
	System.out.println("the count of alphabets is the given string"+countofalphabebet);
		System.out.println("the count of Digit is the given string"+countofDigit);
		System.out.println("the count of space is the given string"+countofspace);
int countofspecialcharacters=c1.length-(countofspace+countofDigit+countofalphabebet);
System.out.println("the count of sepecial characters is given string->"+countofspecialcharacters);
	
	}

}
