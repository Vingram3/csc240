package Lab333;

import java.text.NumberFormat;

public abstract class Policy {

    protected String first, last;
    protected NumberFormat fmt;
    protected double commission;

    public abstract void computeCommission();

    public Policy() {

        first = null;
        last = null;
        commission = 0;
        fmt = NumberFormat.getCurrencyInstance();
    }


    public Policy(String firstName, String lastName)
    {
        this.first = firstName;
        this.last = lastName;
        commission = 0.0;
        fmt = NumberFormat.getCurrencyInstance();
    }

    public String getFirst() {
        return this.first;
    }
    public String getLast() {
        return this.last;
    }
    public double getCommission() {
        return this.commission;
    }
    public void setFirstName(String firstName) {
        this.first = firstName;
    }
    public void setLastName(String lastName) {
        this.last = lastName;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }



    public String toString() {
        String result = "\n" + "Commission: " + fmt.format(commission)
 + "\n";
        result += "Name: " + first + " " + last + "\n";
        return result;
        }

}
