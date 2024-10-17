package Lab333;

import java.text.NumberFormat;

public class Life extends Policy{
    private int age;
    private double termLife;
   

    public Life(String first, String last, int age1, double termLife1)
    {
    	super(first, last);
        age = age1;
        termLife = termLife1;
    }

    public void computeCommission()
    {
        commission = termLife * .2;

    }


    public int getAge()
    {
        return age;
    }
    public double getTermLife()
    {
        return termLife;
    }
   

    void setAge(int a1)
    {
        age = a1;
    }
    public void setTermLife(double t1)
    {
        termLife = t1;
    }
   

    public String toString()
    {
        NumberFormat form = NumberFormat.getCurrencyInstance();

        String report = "\nLife Policy\n" + "----------";
        report += super.toString();
        report += "\nAge: " + age;
        report += "\nTerm: " + form.format(termLife) + '\n';

        return report;
    }
    }
