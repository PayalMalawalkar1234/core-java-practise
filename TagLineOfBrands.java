/* Write a java program to print the tagline of any 5 companies (Enahnced switch case).
By @Payal Malawalkar
Date : 15 Sept 2022 */

class TagLineOfBrand
{	
	// Creating a method Print Tagline of different brands
	static void printTaglineOf(String brand)
	{
		
		// Switch case 
		
		switch(brand)
		{
			
			// if the case is Samsung
			case "Samsung" ->System.out.println("Samsung ---> \"Do what you want\" ."); 
			// if the case is a BMW 
			case "BMW" ->System.out.println("BMW ---> \"The Ultimate Driving Machine\" .");
			// if the case is Uber 
			case "Uber" ->System.out.println("Uber ---> \"Move the way you want\" ."); 
			// if the case is walmart
			case "Walmart" ->System.out.println("Walmart ---> \"Save Money,Live Better\" ."); 
			// if the case is toyota
			case "Toyota" ->System.out.println("Toyota ---> \"Let's go places\" ."); 
			// if the case is not found
			
			      default ->System.out.println("Wrong input.");      
		
		// Switch case end
		}
		
		
	}
	
	// Calling the main method
	public static void main(String args[])
	{	
		String brandName=args[0];
		// Calling the tag line printing method
		printTaglineOf(brandName.toLowerCase());			
		
	}
}