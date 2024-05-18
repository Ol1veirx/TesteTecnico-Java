import Enums.Role;
import Models.Company;
import Models.Employee;
import Models.Sale;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        List<Sale> sales = new ArrayList<>();


        employees.add(new Employee("Jorge Carvalho", Role.SECRETARY, "01/2018"));
        employees.add(new Employee("Maria Souza", Role.SECRETARY, "12/2015"));
        employees.add(new Employee("Ana Silva", Role.SALESPERSON, "12/2021"));
        employees.add(new Employee("João Mendes", Role.SALESPERSON, "12/2021"));
        employees.add(new Employee("Juliana Alves", Role.MANAGER, "07/2017"));
        employees.add(new Employee("Bento Albino", Role.MANAGER, "03/2014"));

        Sale anaSales = new Sale(employees.get(2), 12, 2021, 5200.00);
        Sale joaoSales = new Sale(employees.get(3), 12, 2021, 3400.00);


        sales.add(anaSales);
        sales.add(joaoSales);

        Company company = new Company(employees, sales);

        System.out.println("List of Employees:");
        for (Employee employee : company.getEmployees()) {
            System.out.println(employee.getName() + " - " + employee.getRole() + " - " + employee.getHiringDate());
        }

        System.out.println("\nSales Records:");
        for (Sale sale : company.getSales()) {
            System.out.println(sale.getEmployee().getName() + ": " + sale.getValue());
        }
    }
}