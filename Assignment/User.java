/* Write a java program to print name,gender and age of the user entered
using scanner.
@Author Payal
Date: 29-09-2022  */

import java.util.Scanner;
//declaring User class
class User
{  //start of class 
	//main method
	public static void main(String[] args)
	{
		//Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of user"); //Name input
		String nm=sc.next();
        System.out.println("Enter gender of user"); // gender input
        String g=sc.next();	
		System.out.println("Enter age of user"); //age input
		int a=sc.nextInt();
		
		System.out.println("Name:"+nm+" "+"gender:"+" "+g+" "+"Age:"+a);
	}
}// end of class
