/* Java progam to find whether the character entered is vowel,
consonant ,number and special character.
By @Payal Malawalkar
Date 15 Sept 2022 */


import java.util.Scanner;
public class Input
{
   public static void main(String args[])
   {
   
      System.out.println("Enter a input :");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
	  
      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
	  {
         System.out.println("Given input is an vowel");
      } 
	  else if (ch == '!'|| ch == '@'|| ch == '#'|| ch == '$'|| ch == '%'|| ch == '^'|| ch == '&'|| ch == '*'|| ch == '('|| ch == ')'|| ch == '_'|| ch == '-'|| ch == '+')
	  {         
	    System.out.println("Given input is a special character");     
      }
	  
      Scanner sc = new Scanner(System.in);
	  int i = sc.nextInt();
	  else if(int i== 0,1,2,3,4,5,6,7,8,9)
	  {
	   System.out.println("Given input is a number");
	  } else
	  
	   System.out.println("Given input is a consonant");
	  
   }
}