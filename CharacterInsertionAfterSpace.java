//3c. Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".
package com.whitebox.edu;
//not working properly
public class CharacterInsertionAfterSpace{
	// not working properly
	
	public static void main(String[] args) {
		int Count = 0;
		
		StringBuffer buf = new StringBuffer("This is nice");
			
		        for (int i = buf.length()-1; i>0 ; i--){
		        	if (buf.charAt(i) == ' '){
		        		buf.insert(i,Count);		        	 		
		        	}
	        	
	        	Count++;
		        }
		        buf.insert(buf.length()-1, Count);
		        System.out.println(buf);
		        
		    }
			
	}


