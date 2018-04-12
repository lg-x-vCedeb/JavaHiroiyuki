
public class Start {
	public static void main(String[] args){
		Animal.testAnimal();
	}
}

//**********************************
//			GoldenDartFrog
//**********			  **********
class GoldenDartFrog extends Animal{
	private String color;
	
	public GoldenDartFrog(String color){
		super(color);
	}
	
	public String getColor(){
		return  "gold";
	}
	
	public boolean isEdible() {
		System.out.println("Do not eat this!");
		return false;
	}
}

//**********************************
//			CoqAuVin
//**********		****************
class CoqAuVin extends Chicken{
	private String color;
	private int numOfFeathers;
	
	public CoqAuVin() {
		super("brown", 0);
	}
	
	public boolean isEdible() {
		System.out.println("we can eat this!");
		return true;
	}
}

//**********************************
//			Chicken
//**********	   *****************
class Chicken extends Bird{
	private String color;
	private int numOfFeathers;
	
	public Chicken(String color, int numOfFeathers) {
		super(color,numOfFeathers);
	}
	
	public Chicken(String color){
		super(color,8000);
	}
	
	public String getColor(){
		return color;
	}
	
	public boolean isEdible() {
		System.out.println("we can eat this!");
		return true;
	}
}

//**********************************
//			HoodedPitohui			
//**********			 ***********
class HoodedPitohui extends Bird{

	private String color;
	private int numOfFeathers;

	public HoodedPitohui() {
		super("orange-blank", 4000);
		// TODO Auto-generated constructor stub
	}

	public boolean isEdible() {
		System.out.println("Do not eat this!");
		return false;
	}
}

//**********************************
//			Bird				
//**********	********************
class Bird extends Animal{
	private String color;
	private int numOfFeathers;
	
	public Bird(String color, int numOfFeathers) {
		super(color);
		this.numOfFeathers = numOfFeathers;
	}
	
	public int getNumOfFeathers() {
		return numOfFeathers;
	}
	
	public boolean isEdible() {
		System.out.println("we can eat this!");
		return true;
	}
}

//**********************************
//			Animal
//**********	  ******************
class Animal{
	private String color;
	
	public Animal(String color){
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
	public boolean isEdible(){
		System.out.println("We need to know what kind of animal it is or they are.");
		return false;
	}
	
	public static void testAnimal(){
		Animal a1 = new Animal("Green");
		System.out.println("The " + a1.getClass().getName() + "'s color is " + a1.getColor() + ", which is " + a1.getColor().equals("Green"));
		System.out.println(a1.isEdible());
		
		Animal b1 = new Bird("Blue",314);
		System.out.println("The " + b1.getClass().getName() + "'s color is " + b1.getColor() + ", which is " + b1.getColor().equals("Blue"));
		System.out.println(b1.isEdible());
		
		Animal c1 = new Chicken("Yellow",340);
		System.out.println("The " + c1.getClass().getName() + "'s color is " + c1.getColor() + ", which is " + c1.getColor().equals("Yellow"));
		System.out.println(c1.isEdible());
		
		Animal c2 = new Chicken("Yellow");
		System.out.println("The " + c2.getClass().getName() + "'s color is " + c2.getColor() + ", which is " + c2.getColor().equals("Green"));
		System.out.println(c2.isEdible());
	}
}
