package Models;

import Interfaces.PaymentCalculator;

import java.util.List;

public class PaymentCalculatorImpl implements PaymentCalculator {
    @Override
    public double calculateTotalPayment(List<Employee> employees, Integer month, Integer year) {
        double totalPayment = 0;
        for (Employee employee : employees) {
            if (employee.getHiringDate().contains("/" + year) && Integer.parseInt(employee.getHiringDate().substring(3, 5)) <= month) {
                totalPayment += employee.getRole().calculateSalary(month, year, employee.getHiringDate()) +
                        employee.getRole().calculateBenefit(month, year, employee.getHiringDate());
            }
        }
        return totalPayment;
    }

    @Override
    public double calculateTotalPayment(List<Employee> employees, int month, int year) {
        return 0;
    }

    @Override
    public double calculateTotalSalaries(List<Employee> employees, int month, int year) {
        double totalSalaries = 0;
        for (Employee employee : employees) {
            if (employee.getHiringDate().contains("/" + year) && Integer.parseInt(employee.getHiringDate().substring(3, 5)) <= month) {
                totalSalaries += employee.getRole().calculateSalary(month, year, employee.getHiringDate());
            }
        }
        return totalSalaries;
    }


    @Override
    public double calculateTotalBenefits(List<Employee> employees, int month, int year) {
        double totalBenefits = 0;
        for (Employee employee : employees) {
            if (employee.getHiringDate().contains("/" + year) && Integer.parseInt(employee.getHiringDate().substring(3, 5)) <= month) {
                totalBenefits += employee.getRole().calculateBenefit(month, year, employee.getHiringDate());
            }
        }
        return totalBenefits;
    }

    @Override
    public String getHighestPaidEmployee(List<Employee> employees, int month, int year) {
        double maxPayment = 0;
        String highestPaidEmployee = "";
        for (Employee employee : employees) {
            if (employee.getHiringDate().contains("/" + year) && Integer.parseInt(employee.getHiringDate().substring(3, 5)) <= month) {
                double payment = employee.getRole().calculateSalary(month, year, employee.getHiringDate()) +
                        employee.getRole().calculateBenefit(month, year, employee.getHiringDate());
                if (payment > maxPayment) {
                    maxPayment = payment;
                    highestPaidEmployee = employee.getName();
                }
            }
        }
        return highestPaidEmployee;
    }


    @Override
    public String getHighestBenefitEmployee(List<Employee> employees, int month, int year) {
        double maxBenefit = 0;
        String highestBenefitEmployee = "";
        for (Employee employee : employees) {
            if (employee.getHiringDate().contains("/" + year) && Integer.parseInt(employee.getHiringDate().substring(3, 5)) <= month) {
                double benefit = employee.getRole().calculateBenefit(month, year, employee.getHiringDate());
                if (benefit > maxBenefit) {
                    maxBenefit = benefit;
                    highestBenefitEmployee = employee.getName();
                }
            }
        }
        return highestBenefitEmployee;
    }
}
