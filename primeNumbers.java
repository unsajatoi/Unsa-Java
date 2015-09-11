package com.whitebox.edu;

public class primeNumbers {
	 
    public static boolean isPrimeNumber(int number){
    	
        for(int i=2; i<=number/2; i++){
        	System.out.println(number/2);
        	System.out.println(i);
        	System.out.println(number % i );
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
     
    public static void main(String a[]){
    	
        System.out.println("Is 17 prime number? "+ isPrimeNumber(17));
       
    }
}
