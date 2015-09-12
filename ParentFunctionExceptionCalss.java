//7b. Class
//Write a program containing a function which is expected to throw any kind of exception say NullPointerException or ArithmeticException etc and then handle this function in the parent function which calls this function.
public class ParentFunctionExceptionCalss {
	
	public void standardClassFunction() throws Exception 
	{

		String value = null;
	        System.out.println(value.length());

	}

}
