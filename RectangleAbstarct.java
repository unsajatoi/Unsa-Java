//6c. Did on my own to test Rectangle same as Circle
//Write a program that creates a class Circle extending Shape abstract class and implementing ShapeConstants interface and has following behavior.
//--> Properties: radius.
//--> Constructor: To set number of sides.
//--> Overrides all the methods from parents.

public class RectangleAbstarct extends AbstractClassAndMethod {
    private final double width, length; //sides

    public RectangleAbstarct() {
        this(1,1);
    }
    public RectangleAbstarct(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        // A = w * l
        return width * length;
    }

    @Override
    public double perimeter() {
        // P = 2(w + l)
        return 2 * (width + length);
    }
    @Override
    public int noOfSide() {
        
    	return 4;
    }

}