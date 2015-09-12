//7b.Main  Write a program containing a function which is expected to throw any kind of exception say NullPointerException or ArithmeticException etc and then handle this function in the parent function which calls this function.
public class ParentFunctionException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentFunctionException obj = new ParentFunctionException();
		
		obj.myActivityMethod();
		
		//myActivityMethod();
	}
	private void myActivityMethod()
	{
	    try
	    {
	        ParentFunctionExceptionCalss myClass = new ParentFunctionExceptionCalss();
	        myClass.standardClassFunction();
	    }
	    catch (Exception ex)
	    {
	        System.out.println("Caught Null Exception");
	    }
	}

}
