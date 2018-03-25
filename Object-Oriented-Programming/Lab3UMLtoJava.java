public class Start {
	public static void main(String[] args){
		Student.TestStudent();
	}
}

class Student{
	private int ID;
	private char grade;
	private boolean sleeping;
	static String name = new String("Douglas");
	
	public Student(int ID,String name){
		this.ID = ID > 0 ? ID : 0;
		this.name = name;
	}
	public Student(int ID,String name,char grade){
		this.ID = ID > 0 ? ID : 0;
		this.name = name;
		this.grade = grade;
		sleeping = true;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setGrade(char grade){
		this.grade = grade;
	}
	
	public int getID(){
		return ID;
	}
	public char getGrade(){
		return grade;
	}
	public String getName(){
		return name;
	}
	public boolean isSleeping(){
		return sleeping;
	}
	
	public void goToSleep(){
		sleeping = true;
		if(grade != 'F'){
			grade += 1;
		}
	}
	public void wakeUp(){
		sleeping = false;
	}
	static Student s = new Student(3039,"Douglas",'B');
	public static void TestStudent(){
		System.out.println(s.getID()+" "+s.getName()+" "+s.getGrade());
		s.setName("Sybil");
		s.setGrade('A');
		s.ID += 1001;
		System.out.println(s.getID()+" "+s.getName()+" "+s.getGrade());
		if(s.getName() == "Sybil" && s.isSleeping() == true){
			s.goToSleep();
			System.out.println(s.getID()+" "+s.getName()+" is sleeping, she gets "+s.getGrade());
		}
		else if(s.getName() == "Sybil" && s.isSleeping() == false){
			s.wakeUp();
			System.out.println(s.getID()+" "+s.getName()+" wakes up, she just keeps "+s.getGrade());
		}
	}
}
