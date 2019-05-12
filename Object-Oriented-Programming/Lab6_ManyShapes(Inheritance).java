import java.util.ArrayList;
public class Start {
	public static void main(String[] args) {
		Circle.testCircle();
		Dot.testDot();
		Rectangle.testRectangle();
		Square.testSquare();
		Shape.testShape();
		ManyShapes.testManyShapes();
	}
}



//Circle
class Circle extends Shape{
	private double radius;
	
	public Circle(double x, double y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public double area() {
		return (Math.PI * radius * radius * 0.5);
	}
	
	public static void  testCircle() {
		Circle c1 = new Circle(0,0,1);
		System.out.println(c1.area());
		c1.radius = 2;
		System.out.println(c1.area());
	}
}



//Rectangle
class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle(double x, double y, double width, double length) {
		super(x,y);
		this.width = width;
		this.length = length;
	}
	
	public double area() {
		return width * length;
	}
	
	public static void testRectangle() {
		Rectangle r1 = new Rectangle(0,0,1,2);
		System.out.println("The start point of r1 is: (" + r1.getX() + "," + r1.getY() + ")");
		System.out.println("The area of r1 is: " + r1.area());
		
		Rectangle sr1 = new Square(0,0,1);
		System.out.println("The area of sr1 is: " + sr1.area());
	}
}

//Square
class Square extends Rectangle {

	public Square(double x, double y, double side) {
		super(x, y, side, side);
		super.area();
	}

	public static void testSquare() {
		Square sr1 = new Square(0,0,1);
		System.out.println("The area of sr1 is: " + sr1.area());
	}
}



//Dot
class Dot extends Shape{
	
	public Dot(double x, double y) {
		super(x,y);
	}
	
	public double area() {
		return 0;
	}
	
	public static void testDot() {
		Dot orgin = new Dot(0,0);
		System.out.println("The x of origin is: " + orgin.getX());
		System.out.println("The y of origin is: " + orgin.getY());
		System.out.println("The area of origin is: " + orgin.area());
	}
}





//Shape
class Shape{
	private double x;
	private double y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double area() {
		System.out.println("An unknown shape has an unknown area!");
		return -1.0;
	}
	
	public static void testShape() {
		Shape uns = new Shape(0,0);
		System.out.println(uns.getX() == 0);
		System.out.println(uns.getY() == 0);
		System.out.println(uns.area() == -1.0);
		
		Shape c1 = new Circle(0,0,1);
		System.out.println("C1's x is: " + c1.getX());
		System.out.println("C1's y is: " + c1.getY());
		System.out.println("C1's area is " + c1.area());
		
		Shape orgin = new Dot(0,0);
		System.out.println("The x of origin is: " + orgin.getX());
		System.out.println("The y of origin is: " + orgin.getY());
		
		Shape r1 = new Rectangle(0,0,1,2);
		System.out.println("The start point of r1 is: (" + r1.getX() + "," + r1.getY() + ")");
		System.out.println("The area of r1 is: " + r1.area());
		
		Shape sr1 = new Square(0,0,1);
		System.out.println("The area of sr1 is: " + sr1.area());
	}
	
}


class ManyShapes{
	private ArrayList<Shape> allShapes;
	
	public ManyShapes() {
		ArrayList<Shape> a1 = new ArrayList<Shape>();
		this.allShapes = a1;
	}
	
	public void addShape(Shape s) {
		allShapes.add(s);
	}
	
	public void listAllShapes() {
		for(int i = 0; i < allShapes.size(); i++) {
			System.out.println(allShapes.get(i).getClass().getName() + " has area " + allShapes.get(i).area());	
		}
	}
	
	public static void testManyShapes() {
		ManyShapes m = new ManyShapes();
		m.addShape(new Circle(1.2, 3.4, 4.0)); // Upcast from Circle to Shape.
		m.addShape(new Dot(1.2, 3.4)); // Upcast from Dot to Shape.
		m.addShape(new Rectangle(1.2, 3.4, 4.0, 5.0)); // Upcast from Rectangle to Shape.
		m.addShape(new Shape(1.2, 3.4));
		m.addShape(new Square(1.2, 3.4, 5.0)); // Upcast from Square to Shape.
		m.listAllShapes();

	}
}
