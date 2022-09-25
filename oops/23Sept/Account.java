/* Program:- Account class 
@Author:-Payal Malawalkar
Date:- 23 Sept */

import java.util.Scanner;


class Account
{	
private int accountId;
private String accountHolderName;
private int accountBalance;

Account()
{
	// no arg constructor
}
      //parameterised constructor
Account(int accountId,String accountHolderName,int accountBalance);
this.accountId = accountId;
this.accountHolderName = accountHolderName;
this.accountBalance = accountBalance;
 
// getter for accountId
public int getAccountId()
{
	return this.accountId;
	
}
 // setter for accountId
 public void setAccountId(int accountId)
 {
	 this.accountId=accountId;
 }
 // getter for accountHolderName
public String getAccountHolderName()
{
	return this.accountHolderName;
	
}
 // setter for accountHolderName
 public void setAccountHolderName(String accountHolderName)
 {
	 this.accountHolderName=accountHolderName;
 }
 // getter for accountBalance
public int getAccountBalance()
{
	return this.accountBalance;
	
}
 // setter for accountBalance
 public void setAccountBalance(int accountBalance)
 {
	 this.accountBalance=accountBalance;
 }
 
 
 class Bank
 {
	 public static void main(String ...args)
	 {
		 Account a1[]=new Account[6];  // creating array of 5 account holders
         
         // constructor injection
		 a1[0]=new Account(101,"Ram",1200);
		 a1[1]=new Account(102,"Shyam",100);
		 a1[2]=new Account(103,"Sam",13000);
		 a1[3]=new Account(104,"Tom",500);
		 a1[4]=new Account(105,"Om",4000);
		 a1[5]=new Account(106,"John",6000);
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Size of the array of Account Holders : ");
		 int size=sc.nextInt();
		 Account a1[]=new Account[size];
		 
		 //for inputs
		 for(int i=0;i<a1.length;i++)
		 {
			 a1[i]=new Account();
			 System.out.println("Enter Accout Id : ");
			 a1[i]=new setAccountId(sc.nextInt());
			 System.out.println("Enter Account Holder Name : ");
			 a1[i]=new setAccountId(sc.nextString());
			 System.out.println("Enter Account Balance : ");
			 a1[i]=new setAccountId(sc.nextInt());
			 
		 }
		 for(int i=0;i<a1.length;i++)
		 {
			 int amount=a1[i]getAccountBalance();
			 
			 // if account balance is less than 1000 print account details
			 if(amount<1000)
			 {
				 System.out.println("Account Details are : ");
				 System.out.println("The account id is : ");
				 System.out.println("The account holder's name is : ");
				 System.out.println("The accout balance is : ");
				 
			 }
		 }
		 
	 }
 } // end of class bank
 
} // end of class Account