
public class Start {
	public static void main(String[] args) throws CannotResizeException, BadRadiusException {
		Shape.testShape();
		Circle.testCircle();
		Dot.testDot();
		Rectangle.testRectangle();
		Square.testSquare();
	}
}

class Shape{
	private double x;
	private double y;
	
	public Shape(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public double area() {
		return 0;
	}
	
	public void resize(double newSize) throws CannotResizeException, BadRadiusException {
		throw new CannotResizeException("Cannot resize a dot!");
	}
	
	public static void testShape() {
		System.out.println("class Shape test: ");
		Shape s1 = new Shape(1,0);
		System.out.println("The location of the central point of the shape is " + (s1.getX() == 1.0 && s1.getY() == 0.0));
		System.out.println("");
	}
}

class Circle extends Shape{
	private double radius;
	
	public Circle(double x, double y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI*radius*radius*0.5;
	}
	
	public void resize(double newRadius) throws BadRadiusException{
		if(newRadius >= 0) {
			this.radius = newRadius;
		}
		else {
			throw new BadRadiusException("Radius must be positive.");
		}
	}
	
	public static void testCircle() throws BadRadiusException {
		System.out.println("class Circle test: ");
		Circle c2 = new Circle(0,0,1);
		System.out.println("The location of the central point of the shape is " + (c2.getX() == 0.0 && c2.getY() == 0.0));
		System.out.println("The radius is " + c2.radius);
		System.out.println("The area of the shape is " + c2.area());
		c2.resize(2);
		System.out.println("The new radius is " + c2.radius);
		System.out.println("The area of the shape is " + c2.area());
		System.out.println("");
	}
}

class Dot extends Shape{
	public Dot(double x, double y) {
		super(x,y);
	}
	
	public double area() {
		return 0;
	}
	
	public void resize(double newSize) throws CannotResizeException{
		throw new CannotResizeException("Cannot resize a dot!");
	} 
	
	public static void testDot() {
		try {
		System.out.println("class Dot test: ");
		Dot d2 = new Dot(0,0);
		System.out.println("The location of the central point of the shape is " + (d2.getX() == 0.0 && d2.getY() == 0.0));
		System.out.println("The area of the shape is " + d2.area());
		d2.resize(2);
		System.out.println("The area of the shape is " + d2.area());
		System.out.println("");
		}catch(Exception e) {
			System.out.println("Catch: " + e.getMessage());
		}
	}
}

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
	
	public void resize(double newSize) {
		width += newSize;
		length += newSize;
	}
	
	public void newsize(double newWidth, double newLength) throws CannotResizeException{
		width = newWidth;
		length = newLength;
	}
	
	public static void testRectangle() {
		System.out.println("class Rectangle test: ");
		Rectangle r2 = new Rectangle(0,0,1,2);
		System.out.println("The location of the central point of the shape is " + (r2.getX() == 0.0 && r2.getY() == 0.0));
		System.out.println("The area of the shape is " + r2.area());
		r2.resize(2);
		System.out.println("The area of the shape is " + r2.area());
		
		Rectangle r3 = new Square(0,0,1);
		System.out.println("The location of the central point of the shape is " + (r3.getX() == 0.0 && r3.getY() == 0.0));
		System.out.println("The area of the shape is " + r3.area());
		r3.resize(2);
		System.out.println("The area of the shape is " + r3.area());
		
		System.out.println("");
	}
}

class Square extends Rectangle{
	private double size;
	
	public Square(double x, double y, double size) {
		super(x,y,size,0);
		this.size = size;
	}
	
	public double area() {
		return size*size;
	}
	
	public void resize(double newWidth, double newLength) throws CannotResizeException{
		if(newWidth != newLength) {
			throw new CannotResizeException("Cannot resize a square into a rectangle");
		}
		else {
			size = newWidth;
		}
	}
	
	public static void testSquare() throws CannotResizeException {
		System.out.println("class Square test: ");
		Square s2 = new Square(0,0,2);
		System.out.println("The location of the central point of the shape is " + (s2.getX() == 0.0 && s2.getY() == 0.0));
		System.out.println("The area of the shape is " + s2.area());
		s2.resize(2);//This is nothing..
		s2.resize(2,1);
		System.out.println("The area of the shape is " + s2.area());
		System.out.println("");
	}
	
}

class CannotResizeException extends Exception{
	public CannotResizeException(String msg) {
		// msg is the message given to the exception when
		// it is created, which will later be the result
		// of calling the getMessage() method.
		super(msg);
	}
}

class BadRadiusException extends Exception{
	public BadRadiusException(String msg) {
		super(msg);
	}
}
