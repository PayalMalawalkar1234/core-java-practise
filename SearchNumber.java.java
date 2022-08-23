/*Program To find no from array
@author Payal
Date- 23 Aug 2022*/
 class SearchNumber
 {
	 //method to find no
	 static int findNumber()
	 {
		 int []arr={78,23,6,56,89};
		 boolean flag = false;
		 // traversing the array
		 
		 for(int i=1;i<arr.length;i++)
		 {
			if(searchNum == arr[i])
				flag=true;
			break; //to come out of loop
             				
		 }
		 if(flag)// flag is true
		 System.out.println("The number "+searchNum+ "is present in the array");
	 else
	     System.out.println("The number "+searchNum+ "is not present in the array");
		 
	 }	 
	 //calling main
		 public static void main(String args[])
		 {
			 //calling findNumber method
			 boolean result;
			 findNumber(Integer.parseInt(args[]));
		 }
	 
 }
 

