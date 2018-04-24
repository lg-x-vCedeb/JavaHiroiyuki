
public class Start {
	public static void main(String[] args) {
		Shape.testShape();
		Circle.testCircle();
		Dot.testDot();
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
	
	public void resize(double newSize) throws Exception {
		
	}
	
	public static void testShape() {
		Shape s1 = new Shape(1,0);
		System.out.println("The location of the central point of the shape is " + (s1.getX() == 1.0 && s1.getY() == 0.0));
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
	
	public void resize(double newRadius) {
		this.radius = newRadius;
	}
	
	public static void testCircle() {
		Circle c2 = new Circle(0,0,1);
		System.out.println("The location of the central point of the shape is " + (c2.getX() == 0.0 && c2.getY() == 0.0));
		System.out.println("The radius is " + c2.radius);
		System.out.println("The area of the shape is " + c2.area());
		c2.resize(2);
		System.out.println("The new radius is " + c2.radius);
		System.out.println("The area of the shape is " + c2.area());
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
		Dot d2 = new Dot(0,0);
		System.out.println("The location of the central point of the shape is " + (d2.getX() == 0.0 && d2.getY() == 0.0));
		System.out.println("The area of the shape is " + d2.area());
		d2.resize(2);
		System.out.println("The area of the shape is " + d2.area());
		}catch(Exception e) {
			System.out.println("Catch: " + e.getMessage());
		}
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
