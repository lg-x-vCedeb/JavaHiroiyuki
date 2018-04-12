
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
	
	public Chicken chick1 = new Chicken(getColor(), 8000);
	
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
		try {
			return isEdible();//The subclass override the isEdible();
		}
		catch{
			throw new Exception("We need to know what kind of animal it is or they are");
		}
		finally {
			System.out.println("Do not eat this!");
			return false;
		}
	}
	
	public static void testAnimal(){
		Animal a1 = new Animal("Green");
		System.out.println("The " + a1.getClass().getName() + "'s color is " + a1.getColor() + ", which is " + a1.getColor().equals("Green"));
		System.out.println(a1.isEdible());
	}
}
