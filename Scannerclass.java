//Assignment 11
// Demonstrate the Scanner class usage by taking 
//user inputs of a student like ID,
//,College,Branch,phone_no and print the same
//

package build;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		
  Scanner s1=new Scanner(System.in);
 String branch= s1.next();
 int studentID =s1.nextInt();
 String college= s1.next();
 long phone_no=s1.nextLong();

	}

}
