package Interfaces;

import Models.Employee;
import Models.Sale;

import java.util.List;

public interface SalesAnalyzer {
    String getBestSeller(List<Employee> employees, List<Sale> sales, int month, int year);

}
