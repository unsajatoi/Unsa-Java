//4f. Write a program to copy content of file into another file.
package com.whitebox.edu;

import java.io.File;

public class CopyFileToAnotherFile {
     
    public static void main(String a[]){
        File file = new File("/home/hduser/");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
    }
}