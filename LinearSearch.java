//2d. Write a program to perform a linear search on any given array.Linear search is the basic search where you look for the element to be searched in a sequential way.
package com.whitebox.edu;


class LinearSearch 
{
  public static void main(String args[])
  {
    int c, n, search;
 
    int[] array = { 
    	    1, 2, 3,
    	    5, 9, 
    	    11, 15, 18
    	};
    
    n = array.length;
    
    
 
    System.out.println("Enter value to find");
    search = 9;
 
    for (c = 0; c < n; c++)
    {
      if (array[c] == search)     /* Searching element is present */
      {
         System.out.println(search + " is present at location " + (c + 1) + ".");
          break;
      }
   }
   if (c == n)  /* Searching element is absent */
      System.out.println(search + " is not present in array.");
  }
}