package insurpol;

import java.text.NumberFormat;

public class Home {
    private String firstName, lastName;
    private double contents, dwelling, liability, commission;
    private int footage;


    public Home()
    {
        contents = 0;
        dwelling= 0;
        footage = 0;
        liability = 0;
    }


    public double computeCommission()
    {
        commission = (liability * .3) + ((dwelling + contents) * .2);
        return commission;
    }


    String getFirstName()
    {
        return firstName;
        }
    String getLastName()
    {
        return lastName;
    }
    double getContents()
    {
        return contents;
    }
    double getDwelling()
    {
        return dwelling;
    }
    int getFootage()
    {
        return footage;
    }
    double getLiability()
    {
        return liability;
    }


    void setFirstName(String fn)
    {
        firstName = fn;
    }
    void setLastName(String ln)
    {
        lastName = ln;
    }
    void setContents(double cntnts)
    {
        contents = cntnts;
    }
    void setDwelling(double dwllng)
    {
        dwelling = dwllng;
    }
    void setFootage(int ftg)
    {
        footage = ftg;
    }
    void setLiability(double lblt)
    {
        liability = lblt;
    }


    public String toString()
    {
        NumberFormat form = NumberFormat.getCurrencyInstance();

        String report = "\nHome Policy\n" + "----------";
        report += "\nName: " + firstName + " " + lastName;
        report += "\nFootage: " + footage;
        report += "\nDwelling: " + form.format(dwelling);
        report += "\nContents: " + form.format(contents);
        report += "\nLiability: " + form.format(liability);
        report += "\nCommission: " + form.format(commission);

        return report;
    }
}