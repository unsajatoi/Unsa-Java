//6a. Test Circle and Triangle
//Write a program creating an abstract class Shape with properties (noOfSides,area,perimeter) and methods(calculateArea,calculatePerimeter,setSides.

public class TestCircleAndRectanlge {

	public static void main(String[] args) {
		double width = 5, length = 7;
		double diameter = 10;
        AbstractClassAndMethod rectangle = new RectangleAbstarct(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting Rectangle area: " + rectangle.area()
                + "\nResulting Rectangle perimeter: " + rectangle.perimeter() + "\n"
        		+ "\nResulting Rectangle Sides: " + rectangle.noOfSide() + "\n");
        
        
        AbstractClassAndMethod Circle = new CircleExtendsShape(5);
        System.out.println("Circle Diameter: " + diameter  
        		+ "\nResulting Circle area: " + Circle.area()
        		+ "\nResulting Circle perimeter: " + Circle.perimeter()
        		+ "\nResulting Circle Side: " + Circle.noOfSide());
	}

}
