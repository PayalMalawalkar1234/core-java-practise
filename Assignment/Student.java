/* Write aprogram to print percentage of a student(input 5 subjects marks)
@Author Payal
Date: 29-09-2022  */

import java.util.Scanner;
class Student
{// start of class
public static void main(String[] args)  //  main method
{
	Scanner sc = new Scanner(System.in);     // scanner class for input
	System.out.println("Enter marks of maths subject");
	int n1=sc.nextInt();
	

	System.out.println("Enter marks of science subject");
	int n2=sc.nextInt();
	
	
	System.out.println("Enter marks of English subject");
	int n3=sc.nextInt();
	
	System.out.println("Enter marks of marathi subject");
	int n4=sc.nextInt();
	
	System.out.println("Enter marks of Sanskrit subject");
	int n5=sc.nextInt();
	
	int sum=n1+n2+n3+n4+n5;
	float per=sum/5f;
	
	System.out.println("Percentage of student is:"+per);   
	
	
} // end of main
}// end of class