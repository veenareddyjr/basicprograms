package build;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("press 1 for sunday");
		System.out.println("press 2 for Monday");
		System.out.println("press 3 for Tuesday");
		System.out.println("press 4 for wednesday");
		System.out.println("press 5 for Thursday");
		System.out.println("press 6 for friday");
		System.out.println("press 7 for saturday");
		
	int input=s1.nextInt();
		
		
		switch(input)
		{
		case 1:System.out.println("Sunday");
		//break;
		case 2:System.out.println("Monday");
		//break;
		case 3:System.out.println("Tuesday");
		//break;
		case 4:System.out.println("wednesday");
		//break;
		case 5:System.out.println("Thursday");
		//break;
		case 6:System.out.println("Friday");
		//break;
		case 7:System.out.println("Saturday");
		//break;
		
	}
	}
}
