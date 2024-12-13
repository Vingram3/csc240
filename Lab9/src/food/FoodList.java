package food;

import java.text.NumberFormat;
import java.util.Random;

public class FoodList {
	
	int fir, sec, thi, rando, ranran;
	double fir1, sec2, thi3;
	NumberFormat fmt = NumberFormat.getPercentInstance();
	Random generator = new Random();


	    private FoodNode list;
	    
	    public FoodList()
	    {
	        list = null;
	    }
	    public void add(FoodLog f)
	    {
	        FoodNode node = new FoodNode(f);
	        FoodNode current;

	        if (list == null)
	            list = node;
	        else
	        {
	            current = list;
	            while (current.next != null)
	                current = current.next;
	            current.next = node;
	        }
	    }
	    
	    
	    private class FoodNode
	    {
	        public FoodLog f;
	        private FoodNode next;
	        public FoodNode(FoodLog f)
	        {
	            this.f = f;
	            this.next = null;
	        }
	    }
	    
	    //returns the list 
	    public String toString()
	    {
	        String result = "";
	        FoodNode current = list;
	        while (current != null)
	        {
	            result += current.f + "\n";
	            current = current.next;
	        }
	        return result;
	    }
	    
	    
	    
	    
	    // Search the selected food in the data base and return if it exists or not
	    public void searchfood(String selectfood)
	    {
	    	FoodNode search = find(selectfood);
	    	if( search == null)
	    	{
	    	System.out.println("Food " + selectfood + " not in database, try again.");
	    	return;
	    	}
	    	}

	    
	    
	    //finds the food in the food data base and compares it
	    public FoodNode find(String selfood)
	    {
	    	FoodNode current;
	    	for(current = list; current != null; current = current.next)
	    	{
	    		if (current.f.getFoodName().equals(selfood) )
	    			return current;
	    	}
	    	return null;
	    }
	    
	    
	    
	    
	    //finds the food in the data base and adds the calories together
	    public void searchcalorie(String first, String second, String third)
	    {
	    	FoodNode search = calorie(first, second, third);
	    
	    		System.out.print(fir + sec + thi);
	    		System.out.print("\nTotal daily percentage: " + (fmt.format(fir1 + sec2 +thi3)));
	    }
	    	

	    	//calorie and percentage of DV 
	    	public FoodNode calorie(String first, String second, String third)
	    	{
	    	FoodNode current;
	    	for(current = list; current != null; current = current.next)
	    	{
	    		if (current.f.getFoodName().equals(first) )
	    		{
	    			fir = current.f.getCal();
	    			fir1 = current.f.getFat();
	    		}
	    		if (current.f.getFoodName().equals(second))
	    		{
	    			sec = current.f.getCal();
	    			sec2 = current.f.getFat();
	    		}
	    		
	    		if (current.f.getFoodName().equals(third))
	    		{
	    			thi = current.f.getCal();
	    			thi3 = current.f.getFat();
	    		}
	    	}
			return null;
	    	}
	    	
	    	
	    	
	    	//Randomizer?
	   
	    	public FoodNode random(String ran) {
	    		FoodNode current = list;

	    		rando = generator.nextInt(27);
	    		while (rando < 26)
	    			{current = current.next; rando ++;}

	    		ran = current.f.getFoodName();
	
	    		System.out.print(ran);
				return null;
	    	}
	    	
	    	
	    	
	    	
	    	//Delete Calorie Limit
	    	
	        public FoodNode findcal(int limit)
		    {
		    	FoodNode current;
		    	for(current = list; current != null; current = current.next)
		    	{
		    		if (current.f.getCal() > (limit) )
		    		{
		    			deleteNode(current.f.getCal());
		    			return current;
		    		}
		    			
		    	}
		    	return null;
		    }
	    	
	    	
	    	
	    	
	    	
	    	public void deleteNode(int call)
	    	{
	    		FoodNode current = list, prev = null;
	    		if (prev.next == null)
	    			current = current.next;
	    		return;
	    		while (current != null)
	    		{
	    			prev = current;
	    			current = current.next;
	    			prev.next = current.next;
	    		}
	    		
	    		
	    		
	    	
	    			
	    	
	    		
	    	}
	    	
	    	


	    
}