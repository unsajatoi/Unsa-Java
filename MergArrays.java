//2g. Write a program to merge 2 arrays.
package com.whitebox.edu;

public class MergArrays{
	
	public static int[] merge(int[] a, int[] b) {

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])       
	            answer[k++] = a[i++];

	        else        
	            answer[k++] = b[j++];               
	    }

	    while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

	    return answer;
	}
	public static void main(String[] args) 
    {
		int number1[]={1,2,3,4};
		int number2[]={7,8,9,10};
		
        
               //System.out.println(i + " - " + names[i]);

      int FinalMerge [] =   merge(number1,number2);
      
      for(int i=0; i<number1.length + number2.length;i++)
		System.out.println(FinalMerge[i]);
    }
}

