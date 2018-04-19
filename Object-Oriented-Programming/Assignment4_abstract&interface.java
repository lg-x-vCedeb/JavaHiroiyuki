
public class Start {
	public static void main(String[] args) {
		Jellyfish.testJellyfish();
		Fish.testFish();
	}
}

class Fish implements Swimmer{
	private String name;
	private Swimmer friend;
	
	public Fish(String name, Swimmer friend) {
		this.name = name;
		this.friend = friend;
	}
	
	public String getName() {
		return name;
	}
	
	public Swimmer getFriend() {
		return friend;
	}
	
	public static void testFish() {
		Swimmer j1 = new Jellyfish("j1");
		Swimmer f1 = new Fish("f1",j1);
		Fish f2 = new Fish("f2",f1);
		Fish f3 = new Fish("f3",f2);
		
		System.out.println(j1.getName() == "j1");
		System.out.println(j1.getFriend() == j1);
		
		System.out.println(f1.getName() == "f1");
		System.out.println(f1.getFriend() == j1);
		
		System.out.println(f2.getName() == "f2");
		System.out.println(f2.getFriend() == f1);
		
		System.out.println(f3.getName() == "f3");
		System.out.println(f3.getFriend() == f2);
		//Fish Carassius_auratus = new Fish("Carassius auratus",Ctenopharyngodon_idellus);
		//Fish Ctenopharyngodon_idellus = new Fish("Ctenopharyngodon idellus",Carassius_auratus);
	}
}

class Jellyfish implements Swimmer{
	private String name;
	
	public Jellyfish(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Jellyfish getFriend() {
		return this;
	}
	
	public static void testJellyfish() {
		Jellyfish j = new Jellyfish("Blob");
		System.out.println(j.getName() == "Blob");
		System.out.println(j.getFriend() == j);
	}
}

interface Swimmer{
	public String getName() ;
	public Swimmer getFriend();
}
