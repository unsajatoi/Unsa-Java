//8a. Write an Immutable class.
public class ImmutableClass {

	public static void main(String[] args) {
		
	}
	public final class Contacts {

	    private final String name;
	    private final String mobile;

	    public Contacts(String name, String mobile) {
	        this.name = name;
	        this.mobile = mobile;
	    }
	  
	    public String getName(){
	        return name;
	    }
	  
	    public String getMobile(){
	        return mobile;
	    }
	}



}
