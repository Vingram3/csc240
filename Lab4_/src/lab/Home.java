package lab;

import java.text.NumberFormat;

public class Home extends Policy {
    private double contents, dwelling, liability;
    private int footage;


    public Home()
    {
    	super();
        contents = 0;
        dwelling= 0;
        footage = 0;
        liability = 0;
    }
	public Home(String firstName, String lastName, int footage, double dwelling, double contents, double liability)
	{
 
		super(firstName, lastName);
		

		this.footage = footage;
		this.dwelling = dwelling;
		this.contents = contents;
		this.liability = liability;
	}

   public void computeCommission()
    {
        commission = (liability * .3) + ((dwelling + contents) * .2);
        
    }


  
   public double getContents()
    {
        return contents;
    }
   public double getDwelling()
    {
        return dwelling;
    }
   public int getFootage()
    {
        return footage;
    }
   public double getLiability()
    {
        return liability;
    }
   
   
   public void setContents(double cntnts)
    {
        contents = cntnts;
    }
   public void setDwelling(double dwllng)
    {
        dwelling = dwllng;
    }
   public void setFootage(int ftg)
    {
        footage = ftg;
    }
   public void setLiability(double lblt)
    {
        liability = lblt;
    }


    public String toString()
    {
        NumberFormat form = NumberFormat.getCurrencyInstance();

        String report = "\nHome Policy\n" + "----------";
        report += super.toString();
        report += "\nFootage: " + footage;
        report += "\nDwelling: " + form.format(dwelling);
        report += "\nContents: " + form.format(contents);
        report += "\nLiability: " + form.format(liability);
        return report;
    }
}
