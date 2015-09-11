//4a --> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
package com.whitebox.edu;

import java.io.*;
public class BufferedReaderInputInt
{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException 
    { 
    BufferedReader in = new BufferedReader( 
    new InputStreamReader( 
    System.in));

    String[] input = new String[2]; 
    int a; 
    int b;

    System.out.print("Please enter two integers: "); 
    input = in.readLine().split(" ");

    a = Integer.parseInt(input[0]); 
    b = Integer.parseInt(input[1]);

    System.out.println(a+b);
    
    }
}
