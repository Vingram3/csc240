package lab;

import java.util.Scanner;

import java.util.ArrayList;

public class CommissionCalculator {
    String a, b, c, d;
    double g, f, e;
    int h, answer;
    
    public CommissionCalculator() {}

    public void Run()
    {
    	ArrayList<Policy> policies = new ArrayList<Policy>();
    	
    	Scanner scanMenu = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
   
        while (answer < 4)
        {

        System.out.print("\n-----------------------------\nWelcome to Parkland Insurance\n-----------------------------");
        System.out.print("\nEnter any of the following:");
        System.out.println("\n       1) Enter auto insurance policy information\n"
                + "       2) Enter home insurance policy information\n"
                + "       3) Enter life insurance policy information\n"
                + "       4) Print all sales entered\n"
                + "       5) Quit");

        answer = scan.nextInt();

        switch (answer)
        {
        case 1:
            System.out.println("Enter the first name of insured: ");
            a = scan.next();
            System.out.println("Enter last name of insured: ");
            b = scan.next();
            System.out.println("Enter make of vehicle: ");
            c = scan.next();
            System.out.println("Enter model of vehicle: ");
            d = scan.next();
            System.out.println("Enter amount of liability: ");
            e = scan.nextDouble();
            System.out.println("Enter amount of collision: ");
            f = scan.nextDouble();
            policies.add(new Auto(a, b, c, d, e, f));
            break;
case 2:
            System.out.println("Enter the first name of insured: ");
            a = scan.next();
            System.out.println("Enter last name of insured: ");
            b = scan.next();
            System.out.println("Enter house square footage: ");
            h = scan.nextInt();
            System.out.println("Enter amount of dwelling: ");
            e = scan.nextDouble();
            System.out.println("Enter amount of contents: ");
            f = scan.nextDouble();
            System.out.println("Enter amount of liability: ");
            g = scan.nextDouble();
            policies.add(new Home(a, b, h, e, f, g));
            break;

        case 3:
            System.out.println("Enter the first name of insured: ");
            a = scan.next();
            System.out.println("Enter last name of insured: ");
            b = scan.next();
            System.out.println("Enter age of insured: ");
            h = scan.nextInt();
            System.out.println("Enter amount of term: ");
            e = scan.nextDouble();
            policies.add(new Life(a, b, h, e));
            break;

        case 4: 
        	for(Policy policy : policies) {
        		policy.computeCommission();
        		System.out.println(policy);
        	}
            break;
        }
        }
    }
}

        

    
