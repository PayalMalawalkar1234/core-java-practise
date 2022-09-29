/* Write aprogram to print whether no entered is even or odd
@Author Payal
Date: 29-09-2022  */

import java.util.Scanner;
// declaring a class
class EvenOddDemo
{ // start of class
	public static void main(String[] args)  // main method
	{
		Scanner sc = new Scanner(System.in);     
		System.out.println("Enter the number");     // taking input
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Number is even");
			
		}else
		{
			System.out.println("Number is odd");
		}
	}
}//end of class