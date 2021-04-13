package dao;

import interfaces.ICompany;
import model.Employee;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    ICompany company;
    Employee john;
    Employee ann;
    Employee emily;
    Employee ivan;
    final int capacity = 5;

    @BeforeAll
    void beforeAll(){
        System.out.println("Before");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each");
    }

    @Test
    void addEmployee() {
        System.out.println("add Employee");
    }

    @Test
    void removeEmployee() {
        System.out.println("remove Employee");
    }

    @Test
    void totalSalary() {
        System.out.println("add Employee");
    }

    @Test
    void avgSalary() {
        System.out.println("average Salary");
    }

    @Test
    void totalSales() {
        System.out.println("total Sales");
    }

    @Test
    void size() {
        System.out.println("size");
    }

    @Test
    void printCompany() {
        System.out.println("print Company");
    }

    @Test
    void getEmployeeById() {
        System.out.println("get Employee by ID");
    }
}