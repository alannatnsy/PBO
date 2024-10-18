class Employee implements Sortable {
    private String name;
    private double salary;
    private int hireday, hiremonth, hireyear;

    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int hireYear() {
        return hireyear;
    }

    @Override
    public int compare(Sortable b) {
        Employee other = (Employee) b;
        return Double.compare(salary, other.salary);
    }
}
