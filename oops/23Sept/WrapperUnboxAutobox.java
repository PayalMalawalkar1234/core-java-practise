/* Program:-wrapper,unboxing and autoboxing
@Author:-Payal Malawalkar
Date:- 23 Sept */


import static java.lang.System.*;

class WrapperUnboxAutobox
{
	public static void main(String ...args)
	{
		int a=34;
		char b='A';
		float c=2.3f;
		long d=56;
		boolean e=true;
		double f=45d;
		byte g=1;
		short h=3;
		
	
	// Autoboxing:- Converting above datatypes into object
	
	    int autoInt=a;
		char autoChar=b;
		float autoFloat=c;
		long autoLong=d;
		boolean autoBool=e;
		double autoDouble=f;
		byte autoByte=g;
		short autoShort=h;
		
	 System.out.println("Autoboxing");
	 System.out.println("Value of int is :"+autoInt);
	 System.out.println("Value of char is :"+autoChar);
	 System.out.println("Value of float is :"+autoFloat);
	 System.out.println("Value of Long is :"+autoLong);
	 System.out.println("Value of bool is :"+autoBool);
	 System.out.println("Value of byte is :"+autoByte);
	 System.out.println("Value of short is :"+autoShort);
	 System.out.println("Value of double is :"+autoDouble);
	 
   // Unboxing:- Converting above objects into datatypes 
   
        int priInt=autoInt;
		char priChar=autoChar;
		float priFloat=autoFloat;
		long priLong=autoLong;
		boolean priBool=autoBool;
		double priDouble=autoDouble;
		byte priByte=autoByte;
		short priShort=autoShort;
   
     System.out.println("Unboxing");
	 System.out.println("Value of int is :"+priInt);
	 System.out.println("Value of char is :"+priChar);
	 System.out.println("Value of float is :"+priFloat);
	 System.out.println("Value of Long is :"+priLong);
	 System.out.println("Value of bool is :"+priBool);
	 System.out.println("Value of byte is :"+priByte);
	 System.out.println("Value of short is :"+priShort);
	 System.out.println("Value of double is :"+priDouble);
	 
	} // end of main

} // end of class