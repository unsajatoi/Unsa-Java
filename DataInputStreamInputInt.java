//4a --> DatainputStream: Use this class to input 2 integer numbers and multiply them.

package com.whitebox.edu;
import java.io.*;
class DataInputStreamInputInt
{
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		String str="Enter two integers:";
		System.out.print(str);
		int i=Integer.parseInt(dis.readLine());
		int g=Integer.parseInt(dis.readLine());
		System.out.println( i + " * " + g + " = " +  g*i);
		}
}