package dao;

import interfaces.ICompany;
import model.BonusWorker;
import model.Employee;

public class Company implements ICompany {
    private Employee[] employees;
    private int size;

    public Company(int capacity) {
        if (capacity <= 0) {
            employees = new Employee[20];
        } else {
            employees = new Employee[capacity];
        }
        size = 0;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (size == employees.length) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (employee.equals(employees[i])) {
                return false;
            }
        }
        employees[size++] = employee;
        //size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        if (size == 0) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            if (id == employees[i].getId()) {
                Employee temp = employees[i];
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
                return temp;
            }
        }
        return null;
    }

    @Override
    public double totalSalary() {
        double result = 0;
        for (int i = 0; i < size; i++) {
            result += employees[i].getSalary();
        }
        return result;
    }

    @Override
    public double avgSalary() {
        if (size > 0) {
            return totalSalary() / size;
        } else {
            return 0;
        }

    }

    @Override
    public double totalSales() {
        double result = 0.0;
        if (size <= 0) {
            return 0;
        }
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof BonusWorker) {
                result += ((BonusWorker) employees[i]).getSales();
            }
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printCompany() {
        System.out.println("The company consists of " + size + " employees: ");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public Employee getEmployeeById(int id) {
        for (int i = 0; i < size; i++) {
            if (id == employees[i].getId()) {
                return employees[i];
            }
        }
        return null;
    }
}
