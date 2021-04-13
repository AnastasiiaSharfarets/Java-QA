package appl;

import dao.Company;
import model.BonusWorker;
import model.Employee;
import model.FixPriceWorker;
import model.SalaryWorker;

public class CompanyAppl {
    public static void main(String[] args) {
        Employee vasya = new FixPriceWorker("Vasya", "programmer", 150, 2000.30);
        Employee katya = new BonusWorker("Katya", "sales manager", 230, 20000.60, 6.9, 1500.0);
        Employee kolya = new SalaryWorker("Kolya", "accountant manager", 450, 1200);

        Company rogaIkopyta = new Company(5);
        rogaIkopyta.addEmployee(vasya);
        rogaIkopyta.addEmployee(katya);
        rogaIkopyta.addEmployee(kolya);

        rogaIkopyta.printCompany();
        System.out.println("============================================================");
        System.out.println("Removed worker: ");
        System.out.println(rogaIkopyta.removeEmployee(1));
        System.out.println("============================================================");
        System.out.println("Total salary: ");
        System.out.println(rogaIkopyta.totalSalary());
        System.out.println("============================================================");
        System.out.println("Average salary: ");
        System.out.println(rogaIkopyta.avgSalary());
        System.out.println("============================================================");
        System.out.println("Total sales: ");
        System.out.println(rogaIkopyta.totalSales());
        System.out.println("============================================================");
        System.out.println("Size of company: ");
        System.out.println(rogaIkopyta.size());
    }
}
