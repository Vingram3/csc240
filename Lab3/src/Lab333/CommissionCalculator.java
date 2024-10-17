package Lab333;

import java.util.Scanner;

public class CommissionCalculator {
    public int answer, a5, a6, b3, b4, b5, b6, c3, c4;
    public String a1, a2, a3, a4, b1, b2, c1, c2;


    public void Run()
    {
        while (answer < 7)
        {

        Scanner scan = new Scanner(System.in);
        System.out.print("\n-----------------------------\nWelcome to Parkland Insurance\n-----------------------------");
        System.out.print("\nEnter any of the following:");
        System.out.println("\n       1) Enter auto insurance policy information\n"
                + "       2) Enter home insurance policy information\n"
                + "       3) Enter life insurance policy information\n"
                + "       4) Compute commission and print auto policy\n"
                + "       5) Compute commission and print home policy\n"
                + "       6) Compute commission and print life policy\n"
                + "       7) Quit");

        answer = scan.nextInt();

        switch (answer)
        {
        case 1:
            System.out.println("Enter the first name of insured: ");
            a1 = scan.next();
            System.out.println("Enter last name of insured: ");
            a2 = scan.next();
            System.out.println("Enter make of vehicle: ");
            a3 = scan.next();
            System.out.println("Enter model of vehicle: ");
            a4 = scan.next();
            System.out.println("Enter amount of liability: ");
            a5 = scan.nextInt();
            System.out.println("Enter amount of collision: ");
            a6 = scan.nextInt();
            break;
case 2:
            System.out.println("Enter the first name of insured: ");
            b1 = scan.next();
            System.out.println("Enter last name of insured: ");
            b2 = scan.next();
            System.out.println("Enter house square footage: ");
            b3 = scan.nextInt();
            System.out.println("Enter amount of dwelling: ");
            b4 = scan.nextInt();
            System.out.println("Enter amount of contents: ");
            b5 = scan.nextInt();
            System.out.println("Enter amount of liability: ");
            b6 = scan.nextInt();
            break;

        case 3:
            System.out.println("Enter the first name of insured: ");
            c1 = scan.next();
            System.out.println("Enter last name of insured: ");
            c2 = scan.next();
            System.out.println("Enter age of insured: ");
            c3 = scan.nextInt();
            System.out.println("Enter amount of term: ");
            c4 = scan.nextInt();
            break;

        case 4: 
            Auto auto1 = new Auto(a1, a2, a3, a4, a5, a6);
            auto1.computeCommission();
            System.out.print(auto1);
            break;

        case 5:
            Home house = new Home();
            house.setFirstName(b1);
            house.setLastName(b2);
            house.setContents(b5);
            house.setDwelling(b4);
            house.setFootage(b3);
            house.setLiability(b6);
            house.computeCommission();
            System.out.print(house);
            break;

        case 6:
            Life lifee = new Life(c1,c2, c3, c4);
            lifee.computeCommission();
            System.out.print(lifee);
            break;
            }
        }

        }

    }
