package insurpol;

import java.text.NumberFormat;

public class Life {
    private int age;
    private double termLife, commission;
    private String firstName, lastName;

    public Life(String fn, String ln, int age1, double termLife1)
    {
        firstName = fn;
        lastName = ln;
        age = age1;
        termLife = termLife1;
    }

    public double computeCommission()
    {
        commission = termLife * .2;
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
    int getAge()
    {
        return age;
    }
    double getTermLife()
    {
        return termLife;
    }
    double getCommission()
    {
        return commission;
    }


    void setFirstName(String fn1)
    {
        firstName = fn1;
    }
    void setLastName(String ln1)
    {
        lastName = ln1;
    }
    void setAge(int a1)
    {
        age = a1;
    }
    void setTermLife(double t1)
    {
        termLife = t1;
    }
    void setCommission(double c1)
    {
        commission = c1;
    }


    public String toString()
    {
        NumberFormat form = NumberFormat.getCurrencyInstance();

        String report = "\nLife Policy\n" + "----------";
        report += "\nName: " + firstName + " " + lastName;
        report += "\nAge: " + age;
        report += "\nTerm: " + form.format(termLife);
        report += "\nCommission: " + form.format(commission) + "\n";

        return report;
    }
    }
