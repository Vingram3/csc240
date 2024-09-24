package insurpol;

import java.text.NumberFormat;

public class Auto {
    private String firstName, lastName, make, model;
    private double liability, collision, commission;

    public Auto(String first, String last, String mk, String mdl, double lblty, double cllsn)
    {
        firstName = first;
        lastName = last;
        make = mk;
        model = mdl;
        liability = lblty;
        collision = cllsn;

    }

    public double computeCommission()
    {
        commission = (liability + collision) * .3;
        return commission;
    }


    String getLastName()
    {
        return lastName;
    }
    String getFirstName()
    {
        return firstName;
    }
    String getMake()
    {
        return make;
    }
    String getModel()
    {
        return model;
    }
    double getLiability()
    {
        return liability;
    }
    double getCollision()
    {
        return collision;
    }
    
    
    void setLastName(String ln)
    {
        lastName = ln;
    }
    void setFirstName(String fn)
    {
        firstName = fn;
    }
    void setMake(String m)
    {
        make = m;
    }
    void setModel(String m)
    {
        model = m;
    }
    void getLiability(double l)
    {
        liability = l;
    }
    void getCollision(double c)
    {
    	collision = c;
    }
    
    
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String report = "Auto Policy\n" + "-----------";
        report += "\nName: " + firstName + " " + lastName;
        report += "\nMake: " + make;
        report += "\nModel: " + model;
        report += "\nLiability: " + fmt.format(liability);
        report += "\nCollision: " + fmt.format(collision);
        report += "\nCommission: " + fmt.format(commission);
        return report;
    }

}



