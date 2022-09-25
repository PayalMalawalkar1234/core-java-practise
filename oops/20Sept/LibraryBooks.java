

import java.util.*;
// declaring a LibraryBook class
class LibraryBook
{
//declaring class properties
private String bookName;
private String authorName;
private float bookPrice;


//method to insert books
void insertBook()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the details of Book");
System.out.println("Book Name");
this.bookName=sc.next();

System.out.println("Enter authorName of the Book");
this.authorName=sc.next();

System.out.println("Enter Book Price");
this.bookPrice=sc.nextFloat();

}
// method to display Book Details
void displayBook()
{
	System.out.println("Book Name:"+ this.bookName+"    "+ "Author Name:"+ this.authorName+"   "+"Book Price:"+this.bookPrice);
	
}

}// end of class

// declaring class BookInput
class BookInput
{
	public static void main(String ...args)
	{
		LibraryBook1= new LibraryBook();
		book1.insertBook();  //explicit
        
        LibraryBook2= new LibraryBook();
		book2.insertBook(); 	

		LibraryBook3= new LibraryBook();
		book3.insertBook();
        
		System.out.println();	 
        System.out.println("------------My Book------------");
         
         // display all the books

         book1.displayBook();
         book2.displayBook();
         book3.displayBook();
         System.out.println("________________________________");		 
	}
}