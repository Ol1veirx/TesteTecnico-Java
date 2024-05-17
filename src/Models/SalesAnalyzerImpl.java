package Models;

import Enums.Role;
import Interfaces.SalesAnalyzer;

import java.util.List;

public class SalesAnalyzerImpl implements SalesAnalyzer {
    @Override
    public String getBestSeller(List<Employee> employees, List<Sale> sales, int month, int year) {
        double maxSales = 0;
        String bestSeller = "";
        for (Employee employee : employees) {
            if (employee.getRole() == Role.SALESPERSON) {
                double salesTotal = 0;
                for (Sale sale : sales) {
                    if (sale.getEmployee().getName().equals(employee.getName()) && sale.getMonth() == month && sale.getYear() == year) {
                        salesTotal += sale.getValue();
                    }
                }
                if (salesTotal > maxSales) {
                    maxSales = salesTotal;
                    bestSeller = employee.getName();
                }
            }
        }
        return bestSeller;
    }
}
