package model;

import java.util.Objects;

import static constants.CompanyConstants.MAX_WORKING_HOURS;

public abstract class Employee {
    private static long number = 1;// статическое поле класса Employee
    protected long id;
    protected String name;
    protected String position;
    protected int workingHours;

    public Employee() {
    }

    public Employee(String name, String position, int workingHours) {
        this.id = number;
        number++;
        if (name.isEmpty()) {
            this.name = "Anonymous";
        } else {
            this.name = name;
        }
        if (position.isEmpty()) {
            this.position = "Intern";
        } else {
            this.position = position;
        }
        setWorkingHours(workingHours);

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setName(String name) {
        if (!name.isEmpty() || !(name == null)) {
            this.name = name;
        }
    }

    public void setPosition(String position) {
        if (!position.isEmpty() || !(position == null)) {
            this.position = position;
        }
    }

    public void setWorkingHours(int workingHours) {
        if (workingHours < 0 || workingHours > MAX_WORKING_HOURS) {
            this.workingHours = 0;
        } else {
            this.workingHours = workingHours;
        }
    }

    protected double calculateSalaryAfterTaxes(double salary) {
        double tax = 0;
        if (salary > 450) {
            tax = salary * 0.19;
        }
        return salary - tax;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) object;
        if (this.id != employee.getId()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public abstract double getSalary();
}
