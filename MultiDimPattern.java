/* Payal Malwalkar
Date: 23 ug 2022
*
* *
* * *
* * * *
* * * * *
*/
//declaring the class
class MultiDimPattern
{
	// method print *
	static void printPattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println("*"+ " ");
			}
			System.out.println();
		}
	}
	
	//main method
	public static void main(String args[])
	{
		printPattern();
	}
}