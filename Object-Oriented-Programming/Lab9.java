
public class Start {
	public static void main(String[] args){
		
	}
}

class Door{
	private boolean isOpen;
	
	public Door(){
		this.isOpen = false;
	}
	
	public boolean isOpen(){
		return this.isOpen;
	}
	
	public void open(){
		if(isOpen() == false){
			isOpen = true;
		}
	}
	
	public void close(){
		if(isOpen() == true){
			isOpen = false;
		}
	}
	
	public static void testDoor(){
		
	}
}

class Car{
	private String name;
	private Door[] doors;
	
	public Car(String name, int numberOfDoors){
		this.name = name;
		this.doors = new Door[numberOfDoors];
	}
	
	public void listDoors(){
		for(Door d : doors){
			System.out.println(this.name + ": door is " + d.isOpen());
		}
	}
	
	public int countOpenDoors(){
		int number = 0;
		for(Door d : doors){
			if(d.isOpen() == true){
				number++;
			}
		}
		return number;
	}
	
	public void openOneDoor(int doorNumber){
		
	}
}
