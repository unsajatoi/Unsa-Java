//5a a. Write a program having different methods to perform below operations.
//--> To create an arraylist and add elements to it.
//--> To search for an element in the list.
//--> To print the elements of the list using iterator.
//--> To print the elements in the reverse order using ListIterator.

import java.util.* ;

class ArrayListExample
{

  public static void main ( String[] args)
  {
    // Create an ArrayList that holds references to String
    ArrayList<String> names = new ArrayList<String>();

    // Capacity starts at 10, but size starts at 0
    System.out.println("initial size: " + names.size() );

    // Add three String references
    names.add("Apple");
    names.add("Boy");
    names.add("Cooper");
    System.out.println("new size: " + names.size() );
    
    boolean blnFound = names.contains("Apple");
    System.out.println("Does arrayList contain 2 ? " + blnFound);
       
    
  
    ListIterator<String> iter1 = names.listIterator();
    
    while (iter1.hasNext()) {
        System.out.println(iter1.next());
      }
    
    System.out.println();
    
      ListIterator<String> iter2 = names.listIterator(names.size());
    while (iter2.hasPrevious()) {
        System.out.println(iter2.previous());
      }
    
      }
  }
