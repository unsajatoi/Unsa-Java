//4A Scanner: Use this class to input 2 integer numbers and sum them.
package com.whitebox.edu;
import java.util.*;
class ScannerAdd
{
   public static void main(String args[])
   {
	   System.out.println("Enter two integers");
	   Scanner scn = new Scanner(System.in);
	    int x = scn.nextInt();
	    int y = scn.nextInt();
	    
	    System.out.println(x+y);
 
   }
}	
