//1b Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5, and "ping pong" if number is divisible by both, else print the number.
package com.whitebox.edu;

public class PingPong {

	public static void main(String[] args) {
		
		System.out.println(0);
		for (int i = 1;  i< 25; i++) {
			if (i%3 == 0 && i%5 == 0 ) {
				System.out.println("Pingpong");
			}
			if (i%3 == 0) {
				System.out.println("ping");
				} 
			else if (i%5 == 0){ 
				System.out.println("pong");
			}
			
			
			else System.out.println(i);	
			
			
		}
		
		

	}

}
