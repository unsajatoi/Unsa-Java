//2E Write a program to sort an array.
package com.whitebox.edu;

public class Ascending_Order 
{
    public static void main(String[] args) 
    {
        int n, temp;
            
        int[] a1 = { 
        	    1, 8, 3,
        	    5, 9, 
        	    11, 15, 18
        	};
        for (int i = 0; i < a1.length; i++) 
        {
            for (int j = i + 1; j < a1.length; j++) 
            {
                if (a1[i] > a1[j]) 
                {
                    temp = a1[i];
                    a1[i] = a1[j];
                    a1[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < a1.length - 1; i++) 
        {
            System.out.print(a1[i] + ",");
        }
        System.out.print(a1[a1.length - 1]);
    }
}
