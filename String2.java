
/*Assignment 37
Write a program to display the time in the format : "Wed, Nov 20"*/

package build;

import java.util.Date;

public class String2 {

	public static void main(String[] args) {
		Date d1=new Date();
		
		System.out.println(d1);
		Date d3=new Date(d1.getTime()-(1000*60*60*24*15));
		System.out.println(d3);
		String input=d3.toString();
		String month=input.substring(4, 7);
		System.out.println(month);
		String date=input.substring(8, 10);
		System.out.println(date);
		String year=input.substring(input.length()-4);
		System.out.println(year);
		System.out.println(date.concat(month).concat(year));

	}

}
