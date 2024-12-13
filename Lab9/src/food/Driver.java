package food;

import java.io.IOException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws IOException{

        FoodList list = new FoodList();
        String foodname = null, foodtype, selectedfood, sel1, sel2;
        int calories, choice, limit;
        double fat;
        Scanner fileScan;


    fileScan = new Scanner(new File("foods.txt"));
    while (fileScan.hasNextLine())
        {
            foodname = (fileScan.next());
            foodtype = (fileScan.next());
            calories = (fileScan.nextInt());
            fat = (fileScan.nextDouble());
            list.add(new FoodLog(foodname, foodtype, calories, fat));
        }


    Scanner scan = new Scanner(System.in);
    choice = 0;
    while (choice < 5)
    {
        System.out.println
    ("\n\n---------------------------------" 
    + "\nWelcome to Parkland Meal Selector"
    + "\n---------------------------------"
    + "\nPlease select from the following"
    + "\n1 - List food database"
    + "\n2 - Create meal by manual selection"
    + "\n3 - Create meal by random selection"
    +"\n4 - Remove foods high in calorie"
    +"\n5 – Exit \n");

        choice = scan.nextInt();

        switch (choice)
        {
        case 1:
            System.out.print(list);
            break;
            
            
            
            //Create a meal by manually selecting three foods
        case 2:
            System.out.print("Enter food name: ");
            Scanner n = new Scanner(System.in);
            selectedfood = n.nextLine();
             list.searchfood(selectedfood);
             
            System.out.print("Enter food name: ");
            sel1 = n.nextLine();
            list.searchfood(sel1);
            
            System.out.print("Enter food name: ");
            sel2 = n.nextLine();
            list.searchfood(sel2);
            

             System.out.println("\n\n===============================\n"
             		+ "Your selected meal");
             System.out.println("Foods: " + selectedfood + " " + sel1 + " " + sel2);
             
             System.out.print("Total calorie count ");
             list.searchcalorie(selectedfood, sel1, sel2);
             System.out.print("\n===============================\n");
             
            break;
            
            
            
        case 3:
            
        	System.out.print("===============================\r\n"
        			+ "Your selected meal");
        	String ran = null;
        	list.random(ran);
        	String ran2 = null;
        	list.random(ran2);
        	String ran3 = null;
        	list.random(ran3);
        	
        	list.searchcalorie(ran, ran2, ran3);
        	
        	
        	
        	
        	
            break;
        case 4:
            System.out.print("Enter calorie limit: ");
            Scanner n1 = new Scanner(System.in);
            limit = n1.nextInt();
            list.findcal(limit);
            System.out.print(list);
            
            
        }



    }
	}
}




    