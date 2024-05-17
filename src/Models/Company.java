package Models;

import Interfaces.PaymentCalculator;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;
    private List<Sale> sales;
    private PaymentCalculator paymentCalculator;

    public Company() {}

    public Company(List<Employee> employees, List<Sale> sales, PaymentCalculator paymentCalculator) {
        this.employees = employees;
        this.sales = sales;
        this.paymentCalculator = paymentCalculator;
    }

    public Company(List<Employee> employees, List<Sale> sales) {
        this.employees = employees;
        this.sales = sales;
    }



    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public PaymentCalculator getPaymentCalculator() {
        return paymentCalculator;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addSale(Sale sale) {
        sales.add(sale);
    }

    public double calculateTotalPayment(int month, int year) {
        return paymentCalculator.calculateTotalPayment(employees, month, year);
    }

    public double calculateTotalSalaries(int month, int year) {
        return paymentCalculator.calculateTotalSalaries(employees, month, year);
    }

    public double calculateTotalBenefits(int month, int year) {
        return paymentCalculator.calculateTotalBenefits(employees, month, year);
    }

    public String getHighestPaidEmployee(int month, int year) {
        return paymentCalculator.getHighestPaidEmployee(employees, month, year);
    }

    public String getHighestBenefitEmployee(int month, int year) {
        return paymentCalculator.getHighestBenefitEmployee(employees, month, year);
    }

}
