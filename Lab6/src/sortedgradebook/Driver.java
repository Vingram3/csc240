package sortedgradebook;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Gradebook gradebook = new Gradebook();
		int count = 0;
		while (count < 6)
		{
			System.out.print("Enter student <firstName> <lastName> <score>: ");
			gradebook.addStudent(new Student(scan.next(), scan.next(), scan.nextInt()));
			count++;
		}
				
		
		
	
	}

}
