package model;

import static constants.CompanyConstants.MIN_WORKING_HOURS;

public class FixPriceWorker extends Employee {
    private double payment;

    public FixPriceWorker() {
    }

    public FixPriceWorker(String name, String position, int workingHours, double payment) {
        super(name, position, workingHours);
        if (payment > 0) {
            this.payment = payment;
        }
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        if (payment > 0) {
            this.payment = payment;
        }
    }

    @Override
    public double getSalary() {
        if (workingHours >= MIN_WORKING_HOURS) {
            return calculateSalaryAfterTaxes(payment);
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "FixPriceWorker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", workingHours=" + workingHours +
                ", payment=" + payment +
                '}';
    }
}
