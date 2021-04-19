package appl;

import dao.Company;
import interfaces.ICompany;
import model.BonusWorker;
import model.Employee;
import model.FixPriceWorker;
import model.SalaryWorker;

public class CompanyAppl {
    public static void main(String[] args) {
        /*Employee vasya = new FixPriceWorker("Vasya", "programmer", 150, 2000.30);
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
        System.out.println(rogaIkopyta.size());*/

        ICompany company = new Company(6);
//        Employee[]employees = new Employee[6];

        SalaryWorker sw = new SalaryWorker("John","manager",170,10);
        SalaryWorker sw2 = new SalaryWorker("David","hr manager",160,9);

        FixPriceWorker fw = new FixPriceWorker("Helen","designer",200,3000);
        FixPriceWorker fw2 = new FixPriceWorker("Jery","dev ops",170,1000);

        BonusWorker bw = new BonusWorker("Emily","sales manager",90,100_000,0.01,1000);
        BonusWorker bw2 = new BonusWorker("Ann","sales manager",200,40_000,0.01,1000);

//        employees[0] = sw;
//        employees[1] = sw2;
//        employees[2] = fw;
//        employees[3] = fw2;
//        employees[4] = bw;
//        employees[5] = bw2;
//
//        System.out.println(((FixPriceWorker)employees[2]).getPayment());
////        System.out.println(((BonusWorker)employees[2]).getSales());
//        System.out.println("employees[2] instance of FixPriceWorker");
//        System.out.println(employees[2] instanceof FixPriceWorker);
//        System.out.println("employees[2] instance of BonusWorker");
//        System.out.println(employees[2] instanceof BonusWorker);
        company.addEmployee(sw);
        company.addEmployee(sw2);
        company.addEmployee(fw);
        company.addEmployee(fw2);
        System.out.println(company.addEmployee(bw));
        System.out.println(company.addEmployee(bw2));
        System.out.println(company.size());
        company.printCompany();
        company.removeEmployee(2);
        System.out.println("after removal");
        company.printCompany();
    }
}
