
public class Start {
	public static void main(String[] args) {
		Dog.testDog();
		Bird.testBird();
		Maqpie.testMaqpie();
		Ostrich.testOstrich();
		Pegasus.testPegasus();
		Airplane.testAirplane();
		Animal.testAnimal();
		
		Flyer sparrow = new Bird("sparrow",15);
		System.out.println(sparrow.getName() + " is " + sparrow.canFly() + " to fly and it's " + sparrow.isDangerous());
		
		Flyer KLM4805 = new Airplane("KLM4805");
		System.out.println(KLM4805.getName() + " is " + KLM4805.canFly() + " to fly and it's " + KLM4805.isDangerous());
		
		Flyer o3 = new Ostrich("o3");
		System.out.println(o3.getName() + " is " + o3.canFly() + " to fly and it's " + o3.isDangerous());
	}
}

abstract class Animal{
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract int getLegs();
	
	public abstract boolean canFly();
		
	
	public static void testAnimal() {
		//Animal a1 = new Animal("Dead people");
		System.out.println("Can't test any things.");
	}
}

class Dog extends Animal{
	private String name;
	private int Legs;
	
	public Dog(String name) {
		super(name);
	}
	
	public String getName() {
		return name;
	}
	public int getLegs() {
		Legs = 4;
		return Legs;
	}
	
	public boolean canFly() {
		return false;
	}
	
	public static void testDog() {
		Dog d1 = new Dog("Single Dog");
		System.out.println("The number of " + d1.getName() + "'s legs are " + d1.getLegs());
		System.out.println("And " + d1.getName() + " is " + d1.canFly() + " to fly");
	}
}

class Bird extends Animal implements Flyer{
	private String name;
	private int Legs;
	private int numOfEggs;
	
	public Bird(String name, int numOfEggs){
		super(name);
		this.numOfEggs = numOfEggs;
	}
	
	public String getName() {
		return name;
	}
	public int getNumOfEggs() {
		return numOfEggs;
	}
	
	public int getLegs() {
		Legs = 2;
		return Legs;
	}
	
	public boolean canFly() {
		return true;
	}
	
	public boolean isDangerous() {
		return false;
	}
	public static void testBird() {
		Bird b1 = new Bird("you like",2);
		System.out.println("The number of " + b1.getName() + "'s legs are " + b1.getLegs());
		System.out.println("The number of " + b1.getName() + "'s eggs are " + b1.getNumOfEggs());
		System.out.println("And " + b1.getName() + " is " + b1.canFly() + " to fly");
		
		Bird m1 = new Maqpie("you love");
		System.out.println("The number of " + m1.getName() + "'s legs are " + m1.getLegs());
		System.out.println("The number of " + m1.getName() + "'s eggs are " + m1.getNumOfEggs());
		System.out.println("And " + m1.getName() + " is " + m1.canFly() + " to fly");
		
		Bird o1 = new Ostrich("your pashion");
		System.out.println("The number of " + o1.getName() + "'s legs are " + o1.getLegs());
		System.out.println("The number of " + o1.getName() + "'s eggs are " + o1.getNumOfEggs());
		System.out.println("And " + o1.getName() + " is " + o1.canFly() + " to fly");
		
		Bird p1 = new Pegasus("your pashion");
		System.out.println("The number of " + p1.getName() + "'s legs are " + p1.getLegs());
		System.out.println("The number of " + p1.getName() + "'s eggs are " + p1.getNumOfEggs());
		System.out.println("And " + p1.getName() + " is " + p1.canFly() + " to fly");
	}
}

class Maqpie extends Bird{
	private String name;

	public Maqpie(String name) {
		super(name,6);
	}
	
	public String getName() {
		return name;
	}
	
	public boolean canFly() {
		return true;
	}
	
	public boolean isDangerous() {
		return false;
	}
	public static void testMaqpie() {
		Maqpie m2 = new Maqpie("you love");
		System.out.println("The number of " + m2.getName() + "'s legs are " + m2.getLegs());
		System.out.println("The number of " + m2.getName() + "'s eggs are " + m2.getNumOfEggs());
		System.out.println("And " + m2.getName() + " is " + m2.canFly() + " to fly");
	}
}

class Ostrich extends Bird{
	private String name;

	public Ostrich(String name) {
		super(name,10);
	}
	
	public String getName() {
		return name;
	}
	
	public boolean canFly() {
		return false;
	}
	
	public boolean isDangerous() {
		return true;
	}
	public static void testOstrich() {
		Ostrich o2 = new Ostrich("your pashion");
		System.out.println("The number of " + o2.getName() + "'s legs are " + o2.getLegs());
		System.out.println("The number of " + o2.getName() + "'s eggs are " + o2.getNumOfEggs());
		System.out.println("And " + o2.getName() + " is " + o2.canFly() + " to fly");
	}
}

class Pegasus extends Bird{
	private String name;
	private int Legs;
	
	public Pegasus(String name) {
		super(name,0);
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumOfEggs() {
		System.out.println("Pegasi do not lay eggs!");
		return 0;
	}
	
	public int getLegs() {
		Legs = 4;
		return Legs;
	}
	
	public boolean canFly() {
		return true;
	}
	
	public boolean isDangerous() {
		return false;
	}
	public static void testPegasus() {
		Pegasus p2 = new Pegasus("your pashion");
		System.out.println("The number of " + p2.getName() + "'s legs are " + p2.getLegs());
		System.out.println("The number of " + p2.getName() + "'s eggs are " + p2.getNumOfEggs());
		System.out.println("And " + p2.getName() + " is " + p2.canFly() + " to fly");
	}
}

class Airplane implements Flyer{
	private String name;
	
	public Airplane(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean canFly() {
		return true;
	}
	
	public boolean isDangerous() {
		return false;
	}
	public static void testAirplane() {
		Airplane Pan_American = new Airplane("Pan_American");
		System.out.println(Pan_American.getName() + " is " + Pan_American.canFly() + " to fly and it's " + Pan_American.isDangerous());
	}
}

interface Flyer{
	public String getName();
	
	public boolean canFly();
	
	public boolean isDangerous();
}
