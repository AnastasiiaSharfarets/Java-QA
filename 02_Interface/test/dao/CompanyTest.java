package dao;

import interfaces.ICompany;
import model.BonusWorker;
import model.Employee;
import model.FixPriceWorker;
import model.SalaryWorker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    final static int capacity = 6;
    static ICompany company;
    static SalaryWorker sw;
    static SalaryWorker sw2;
    static FixPriceWorker fw;
    static FixPriceWorker fw2;
    static BonusWorker bw;
    static BonusWorker bw2;

    @BeforeAll
    static void setUpBeforeAll(){
        company = new Company(capacity);
        sw = new SalaryWorker("John", "manager", 170, 10);
        sw2 = new SalaryWorker("David", "hr manager", 160, 9);

        fw = new FixPriceWorker("Helen", "designer", 200, 3000);
        fw2 = new FixPriceWorker("Jery", "dev ops", 170, 1000);

        bw = new BonusWorker("Emily", "sales manager", 90, 100_000, 0.01, 1000);
        bw2 = new BonusWorker("Ann", "sales manager", 200, 40_000, 0.01, 1000);
    }

    @BeforeEach
    void setUp(){
        company.addEmployee(sw);
        company.addEmployee(sw2);
        company.addEmployee(fw);
        company.addEmployee(fw2);
        company.addEmployee(bw);
    }

    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(bw));
        assertTrue(company.addEmployee(bw2));
        SalaryWorker sw3 = new SalaryWorker("Philip","manager",160,10);
        assertFalse(company.addEmployee(sw3));
    }

    @Test
    void removeEmployee() {
        assertNotNull(company.removeEmployee(2));
        assertNull(company.removeEmployee(2));
        assertNull(company.removeEmployee(100));
    }

    @Test
    void totalSalary() {
        assertEquals(6593.4,company.totalSalary());
    }

    @Test
    void avgSalary() {
        assertEquals(1318.7,company.avgSalary(),0.1);
    }

    @Test
    void totalSales() {
        assertEquals(100_000,company.totalSales());
        company.addEmployee(bw2);
        assertEquals(140_000,company.totalSales());
    }

    @Test
    void size() {
        assertEquals(5,company.size());
        company.addEmployee(bw2);
        assertEquals(6,company.size());
        company.removeEmployee(2);
        assertEquals(5,company.size());
    }

    @Test
    void getEmployeeById() {
        assertNull(company.getEmployeeById(100));
        //assertEquals(fw,company.getEmployeeById(3));
        assertTrue(fw.equals(company.getEmployeeById(3)));
    }
}