public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales){
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString(){
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    public boolean equals (Object other){
        if (other instanceof Salesperson) {
         Salesperson otherSalesperson = (Salesperson) other;
         return lastName.equals(otherSalesperson.getLastName()) &&
                 firstName.equals(otherSalesperson.getFirstName());
        }
        return false;
    }

    public int compareTo(Salesperson other){
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales;
        } else {
            return this.lastName.compareTo(other.lastName);
        }
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getSales(){
        return totalSales;
    }
}
