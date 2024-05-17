package Models;

public class Sale {
    private Employee employee;
    private int month;
    private int year;
    private double value;

    public Sale(Employee employee, int month, int year, double value) {
        this.employee = employee;
        this.month = month;
        this.year = year;
        this.value = value;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public double getValue() {
        return value;
    }
}
