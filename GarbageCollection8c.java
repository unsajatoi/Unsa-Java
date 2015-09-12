//8c. Write a program implementing explicit garbage collection.

public class GarbageCollection8c {

   public static void main(String[] args) {

   int arr1[] = { 0, 1, 2, 3, 4, 5 };
   int arr2[] = { 0, 10, 20, 30, 40, 50 };
    
   // copies an array from the specified source array
   //public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
   System.arraycopy(arr1, 0, arr2, 0, 1);
   System.out.print("array2 = ");
   System.out.print(arr2[0] + " ");
   System.out.println(arr2[1] + " ");
      
   // it runs the GarbageCollector
   System.gc();
   System.out.println("Cleanup completed..."); 
   }
} 