package lab;

import java.text.NumberFormat;


public class Auto extends Policy {
    private String make, model;
    private double liability, collision;

    public Auto(String first, String last, String mk, String mdl, double lblty, double cllsn)
    {
    	super(first, last);
        make = mk;
        model = mdl;
        liability = lblty;
        collision = cllsn;

    }

    public void computeCommission()
    {
        commission = (liability + collision) * .3;
        return;
    }



    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public double getLiability()
    {
        return liability;
    }
    public double getCollision()
    {
        return collision;
    }
    
    

    public void setMake(String m)
    {
        make = m;
    }
    public void setModel(String m)
    {
        model = m;
    }
    public void getLiability(double l)
    {
        liability = l;
    }
    public void getCollision(double c)
    {
    	collision = c;
    }
    
    
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String report = "Auto Policy\n" + "-----------";
        report += super.toString();
        report += "\nMake: " + make;
        report += "\nModel: " + model;
        report += "\nLiability: " + fmt.format(liability);
        report += "\nCollision: " + fmt.format(collision);
        return report;
    }

}


