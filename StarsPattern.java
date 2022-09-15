 /* Java program to print a pattern 		
     *   //   noOfRows=4
    * *
   * * *
  * * * *   
By Payal Malawalkar
Date 15 Sept 2022   
   */
			 
			 
			 
class StarsPattern 	
{		 
// method to print stars in a triangle shape

static void trianglePattern(int noOfRows)
	{
		for(int i=1;i<=noOfRows;i++) // outer loop for rows
		{
			System.out.println(); // new line after each row
			
			for(int spaces=noOfRows;spaces>i;spaces--)
			{
				System.out.print(" "); // spaces after each *
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* "); //printing *_
			}
			
			
		}
		
		
	}
	
		// main method
   public static void main(String... args)
   {
	  int number =Integer.parseInt(args[0]);
	 // 
	  trianglePattern(number);
      
   }
}