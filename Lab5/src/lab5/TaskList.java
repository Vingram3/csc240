package lab5;

public class TaskList {

	public static void main(String[] args) {
		
	Task p1, p2, p3, p4, p5;
		
		
	System.out.println("Priority Task List");
	System.out.println("------------------");
	
	
	
		p1 = new Task("Attend class");
		p1.setPriority(1);
		System.out.println(p1);
		
		p2 = new Task("Homework");
		p2.setPriority(2);
		System.out.println(p2);
		
		p3 = new Task("Exercise");
		p3.setPriority(3);
		System.out.println(p3);
		
		p4 = new Task("Have breakfast");
		p4.setPriority(4);
		System.out.println(p4);
		
		p5 = new Task("Eat Lunch");
		p5.setPriority(5);
		System.out.println(p5);
		

	}

}
