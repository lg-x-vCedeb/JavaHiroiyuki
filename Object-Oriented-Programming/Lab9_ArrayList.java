
public class start {
    public static void main(String[] args) throws BadCarException{
        Door.testDoor();
        Car.testCar();
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
        if(!isOpen()){
            isOpen = true;
        }
    }

    public void close(){
        if(isOpen()){
            isOpen = false;
        }
    }

    public static void testDoor(){
        Door d1 = new Door();
        System.out.println("Whether the door is open? " + d1.isOpen() );
        d1.open();
        d1.close();
    }
}

class Car{
    private String name;
    private Door[] Doors;

    public Car(String name, int numberOfDoors) throws BadCarException{
        this.name = name;
        if (numberOfDoors < 1){
            throw new BadCarException("A car must have at least one door!");
        }
        this.Doors = new Door[numberOfDoors];
    }

    public void listDoors(){
        for(Door d : Doors){
            System.out.println(this.name + ": door is " + d.isOpen());
        }
    }

    public int countOpenDoors(){
        int number = 0;
        for(Door d : Doors){
            if(d.isOpen()){
                number++;
            }
        }
        return number;
    }

    public void openOneDoor(int doorNumber) throws BadCarException{
        if (doorNumber > this.Doors.length)
            throw new BadCarException("Door " + doorNumber + " does not exist!");
        else {
            Doors[doorNumber].open();
        }
    }

    public void changeAllDoors(){
        for(Door d : Doors){
            if (d.isOpen()){
                d.close();
            }
            else{
                d.open();
            }
        }
    }

    public void replaceAllDoor(){
        for (Door d : Doors){
            d.close();
        }
    }

    public static void testCar() throws BadCarException{
        Car c1 = new Car("Benz",4);
        c1.listDoors();
        System.out.println("The number of doors is " + c1.countOpenDoors());
        c1.openOneDoor(5);
        c1.openOneDoor(3);
        c1.changeAllDoors();
        c1.replaceAllDoor();
    }
}

class BadCarException extends Exception{
    public BadCarException(String msg){
        super(msg);
    }
}
