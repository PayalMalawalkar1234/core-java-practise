/* Program:-VarArgs
@Author:-Payal Malawalkar
Date:- 23 Sept */

import java.lang.System.*;
//Start of class
class Varargs
{
	static void printArray()  // ambigious : empty parameter
	{
		System.out.println("--------Varargs----------");
		
	}
	static void printArray(int...arr)
	{
		System.out.println("-------Integer Array------");
	}
	static void printArray(float...arr)
	{
		System.out.println("-------Float Array------");
		
	}
	static void printArray(char...arr)
	{
		System.out.println("-------Character Array------");
		
	}
	static void printArray(String...arr)
	{
		System.out.println("-------String Array------");
	}
	public static void main(String...args)
	{
		printArray(1,2,3,4,5);
		System.out.println("1,2,3,4,5");
		printArray(1,2.5f,1.2f,3.0f,1.4f,5.2f);
		System.out.println("1,2.5f,1.2f,3.0f,1.4f,5.2f");
		printArray('a','b','c','d','e');
		System.out.println(" 'a','b','c','d','e' ");
		printArray("Payal","Onkar","Malawalkar");
		System.out.println("Payal Onkar Malawalkar");
		printArray();    // empty parameter
	}  // End of Main Method
	
} // End of Class Varargs

