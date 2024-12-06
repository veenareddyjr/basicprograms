/*Assignment 28
Write a Java program to create and display an array of boolean and double data types. 
Initialize the arrays with some sample values and display them in array form.*/

package build;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		String input=" ";
		boolean b4= input.isEmpty();
		if( b4==true)
		{
			System.out.println("since string is empty" );	
		}
		else
		{
	
			System.out.println("since string is not empty");
		}
		
		double salary[]=new double[3];
		salary[0]=80.98;
		salary[1]=989.00;
		salary[2]=77.098;
		double sum=0;
		double average=0;
		
		
		for(int i=0;i<salary.length;i++)
		{
		sum=sum+salary[i];
		}
		System.out.println(sum);
		average=sum/(salary.length);
		System.out.println(average);

	}

}
