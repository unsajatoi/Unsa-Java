//8b. Write a program to print 1 to 10 numbers without using loops and you should not have more than 1 print statement.
public class WithoutLoop {

	public static void main(String[] args) {

		recursiveMe(1); // call the function with 1.
		
	}
	
	
	public static void recursiveMe(int n) {
	    if(n <= 10) {// 10 is the max limit
	        System.out.println(n);//print n
	        recursiveMe(n+1);//call recursiveMe with n=n+1
	    }
	}
	

}
