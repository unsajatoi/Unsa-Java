//2b. Write a program to find the missing number in a series of sorted numbers stored in an array.
package com.whitebox.edu;
public class MissingNumber {

    public static int count = 0;
    public static int position = 0;
    public static boolean flag = false;

    public static void main(String[] args) {

        int a[] = { 0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 20, 21, 23 };

        findMissingNumbers(a, position);

    }

    private static void findMissingNumbers(int a[], int position) {

        if (position == a.length - 1)
            return;

        for (; position < a[a.length - 1]; position++) {
        	//System.out.println(position);
        	//System.out.println(a[position]);
            if ((a[position] - count) != position) {
            	//System.out.println(count);
                System.out.println("Missing Number: " + (position + count));
                flag = true;
                count++;
                
                break;
            }
        }

        if (flag) {
            flag = false;
            //System.out.println(position + "x");
            findMissingNumbers(a, position);
        }
    }

}