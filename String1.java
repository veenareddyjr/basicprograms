/*Assignment 36
Write a program for the below scenarios using date class.
i)To get Current Time 
ii)To get future Time
iii)To get Past Time*/



package build;

import java.util.Date;

public class String1 {

	public static void main(String[] args) 
	{
		
	Date d1=new Date();
	
	System.out.println(d1);
	//i)To get Current Time 
	Date d2=new Date(d1.getTime()+(1000*60*60*24*0));
	System.out.println(d2);
	//iii)To get Past Time
	Date d3=new Date(d1.getTime()-(1000*60*60*24*15));
	System.out.println(d3);
	//ii)To get future Time
	Date d4=new Date(d1.getTime()+(1000*60*60*24*15));
	System.out.println(d4);
	}

}
