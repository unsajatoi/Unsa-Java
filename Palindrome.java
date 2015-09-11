//3e. Write a program to check for a palindrome string.
package com.whitebox.edu;
class Palindrome
{
   public static void main(String args[])
   {
      String original, reverse = "";
     
      original = "madam";
 
      int length = original.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
 
      if (original.equals(reverse))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
 
   }
}	
