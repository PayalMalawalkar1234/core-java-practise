/* Program:- Student class 
@Author:-Payal Malawalkar
Date:- 23 Sept */
import java.util.Scanner;
import java.lang.System.*;

class Student
{
private int stdId;
private String stdName;
private float stdPercentage;

Student()
{
	       // no argument constructor
}
 	
Student(int stdId,String stdName,float stdPercentage)	
{
this.stdId=stdId;
this.stdName=stdName;
this.stdPercentage=stdPercentage;
}
 // getter for stdId
 public int getStdId()
 {
	 return this.stdId;
 }
	// setter for stdId
public void setStdId(int stdId)
{
	this.stdId=stdId;
}

// getter for stdName
 public int getStdName()
 {
	 return this.stdName;
 }
	// setter for stdName
public void setStdName(int stdName)
{
	this.stdName=stdName;
}
// getter for stdPercentage
 public float getStdPercentage()
 {
	 return this.stdPercentage;
 }
	// setter for stdPercentage
public void setStdPercentage(int stdPercentage)
{
	this.stdPercentage=stdPercentage;
}
class college
{
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		Student std[] =new Student [size];
		
		// for input
		for(int i=0;i<std.length;i++)
		{
			std[i]=new Student();
			System.out.println("Enter Student Id : ");
			std[i]setStdId(sc.nextInt());
			System.out.println("Enter Student Name : ");
			std[i]setStdName(sc.nextString());
			System.out.println("Enter Student Percentage : ");
			std[i]setStdPercentage(sc.nextFloat());
			
			
		}
		for(int i=0;i<std.length;i++)
		{
		
			float per=std[i].getStdPercentage();
			// percentage greater than 90
			if(per>=90)
			{		
				
				System.out.println("STUDENT DETAILS ARE : ");
				System.out.println("The student id is : "+std[i].getStdId());
				System.out.println("The student name is : "+std[i].getStdName());
				System.out.println("The student percentage is : "+std[i].getStdPercentage());
			}
			
		}
		
		
	} // class college ends
	
	
} // class student ends


