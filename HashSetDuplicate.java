//5b. Write a program to find duplicates in an array using set.
import java.util.* ;

class HashSetDuplicate
{
    public static void main(String[] args)
    {
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "mno"};
 
        HashSet<String> set = new HashSet<String>();
        
        
        for (String name : strArray ) { 
        	if (set.add(name) == false) 
        	{ 
        		System.out.println("Duplicate Element is : "+name); 
        	} 
        }

        	
    }
}

