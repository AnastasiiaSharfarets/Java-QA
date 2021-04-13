package interfaces;

import model.Employee;

public interface ICompany {
    /**
     * The method adds an employee to the company.
     * @param employee to add
     * @return If the amount of employees equals to the capacity of the company then the method returns false.
     * If the employee is already in the company then the method returns false and the employee is not added.
     * Returns true if the employee is added.
     */
    boolean addEmployee(Employee employee);

    /**
     *
     * @param id
     * @return
     */
    Employee removeEmployee(int id);
    double totalSalary();
    double avgSalary();
    double totalSales();
    int size();
    void printCompany();
    Employee getEmployeeById(int id);
}
