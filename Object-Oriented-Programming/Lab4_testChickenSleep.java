public class Start {
	public static void main(String[] args){
		Chicken.testChicken();//main function
	}
}

class Chicken{
	private double weight;//the current weight of Chicken
	private boolean sleeping;//Chicken's state of sleeping or not
	
	public Chicken(double weight){//+Chicken(double weight)
		this.weight = weight;
	}
	
	public double getWeight(){//+getWeight(): double
		return weight;
	}
	
	public boolean isSleeping(){//+isSleeping(): boolean
		return sleeping;
	}
	
	public void fallAsleep(){//+fallAsleep(): void
		if(sleeping == false){
			sleeping = true;
		}
	}
	
	public void wakeup(){//+wakeup(): void
		if(sleeping == true){
			sleeping = false;
		}
	}
	public static void check(Chicken c){//check & output "sweet dream" or "need coffee" (+check(Chicken c))
		System.out.printf("%s",(c.sleeping == true) ? "sweet dream" : "need coffee"); 
	}
	
	public static void testChicken(){//+testChicken(): void
		Chicken c = new Chicken(2.3);
		
		System.out.println(c.getWeight() == 2.3);
		System.out.println(c.isSleeping() == true);
		c.wakeup();
		System.out.println(c.isSleeping() == false);
		c.wakeup();
		System.out.println(c.isSleeping() == false);
		c.fallAsleep();
		System.out.println(c.isSleeping() == true);
		c.fallAsleep();
		System.out.println(c.isSleeping() == true);
		check(c);
	}
}
