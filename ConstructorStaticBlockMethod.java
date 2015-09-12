//e. Write a program that contains a constructor, a static block and a static method. Execute the program in order to verify the order to execution of methods and block.
public class ConstructorStaticBlockMethod {
 
    
     
    public ConstructorStaticBlockMethod(){
        System.out.println("I am in constructor");
    }
    static {
        System.out.println("I am in static block");
        System.out.println("Static block will be called first than constructor!!!");
        System.out.println("Static block will be called only once.");
        
    }
     
    public static void main(String a[]){
    	ConstructorStaticBlockMethod ksv1 = new ConstructorStaticBlockMethod();
        ConstructorStaticBlockMethod ksv2 = new ConstructorStaticBlockMethod();
        ConstructorStaticBlockMethod ksv3 = new ConstructorStaticBlockMethod();
        ConstructorStaticBlockMethod ksv4 = new ConstructorStaticBlockMethod();
        
        System.out.println(MethodStatic());       
    }
    public static int MethodStatic(){
    	return 0;
    	
    }
}
