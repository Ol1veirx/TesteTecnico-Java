package Interfaces;

import Models.Employee;

import java.util.List;

public interface PaymentCalculator {
    double calculateTotalPayment(List<Employee> employees, Integer month, Integer year);

    double calculateTotalPayment(List<Employee> employees, int month, int year);
    double calculateTotalSalaries(List<Employee> employees, int month, int year);
    double calculateTotalBenefits(List<Employee> employees, int month, int year);
    String getHighestPaidEmployee(List<Employee> employees, int month, int year);
    String getHighestBenefitEmployee(List<Employee> employees, int month, int year);
}
