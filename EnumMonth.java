//5f. Write a program that defines an enum having months of the year and then prints the value of all the enum elements.
public class EnumMonth {
	
	public enum Month
	{
	  JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
	  JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}

	public static void main(String[] args) {
		
		for(Month month: Month.values()){
			    System.out.println(month.name());
		}



	}

}
