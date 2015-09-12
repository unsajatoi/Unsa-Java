//5c. Write a program that creates a class Circle extending Shape abstract class and implementing ShapeConstants interface and has following behavior.
//--> Properties: radius.
//--> Constructor: To set number of sides.
//--> Overrides all the methods from parents.


class CircleExtendsShape extends AbstractClassAndMethod implements ShapeConstantsInterface{

    // constant
    private final double diameter;                 
    
    
   
    
    public CircleExtendsShape(double i) {
    	this.diameter = 5;
	}

    @Override
	public double area () {
        double radius = diameter / 2.0;
        return pi * radius * radius;
    }
    
        

	@Override
	public double perimeter() {
		 double radius = diameter / 2.0;
		 return pi * 2 * radius;
		
	}

	@Override
	public int noOfSide() {
		
		return 0;
	}

}