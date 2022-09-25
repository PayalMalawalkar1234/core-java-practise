/*
Program: Declaring a class and its objects
*/
//declaring a Library Book class

import java.util.*;
class LibraryBook
{
  // declaring properties
  private String bookName;
  private String bookAuthor;
  private double bookPrice;
  
  //method to insert book
  void insertBook()
  {
	  Scanner sc= new Scanner(System.in);
	  
	   System.out.println("Enter the details of Book:");
	   
	   System.out.println("Book Name:");
	   this.bookName= sc.next();
	   
		System.out.println("Book Author:");
		this.bookAuthor= sc.next();
		
		System.out.println("Book Price:");
		this.bookPrice= sc.nextDouble();
    
  }
  
  //method to display book
  void displayBook()
  {
    System.out.println("Book Name:"+ this.bookName+"    "+ "Name:"+ this.bookAuthor+ "   "+"Book Price:"+this.bookPrice);
  }
  
}
// end class 

//declaring class BookInput
class BookInput
{
	
   //main method
	public static void main(String ...args)
	{		
		Library book1;
		book1= new LibraryBook1();
		book1.insertBook(); // explicit
		
		Library book2= new LibraryBook2();
		book2.insertBook();
		
		Library Book3= new LibraryBook3();
		book3.insertBook();
		
		System.out.println();
		System.out.println("---------------------My Library----------------------");
		//display all the books
		book1.displayBook();
		book2.displayBook();
		book3.displayBook();
		System.out.println("---------------------------------------------------");
	}
	
}

