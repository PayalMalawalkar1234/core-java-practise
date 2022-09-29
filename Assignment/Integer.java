/* Write aprogram to print whether no entered is positive,negative or zero.
@Author Payal
Date: 29-09-2022  */
import java.util.Scanner;

class Integer
{ // start of class
	public static void main(String[] args)      // main method
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");    // taking input
		int n=sc.nextInt();
		
		if(n>0)
		{
			System.out.println("Number is positive");     
		}
		else if(n<0)
		{
			System.out.println("Number is negative");
		
		}
		else
		{
			System.out.println("Number is zero");
		}
	}//end of main
}// end of class