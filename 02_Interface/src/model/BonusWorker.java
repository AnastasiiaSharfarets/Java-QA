package model;

import static constants.CompanyConstants.MIN_SALARY;
import static constants.CompanyConstants.MIN_WORKING_HOURS;

public class BonusWorker extends Employee {
    private double sales;
    private double bonusRate;
    private double minPayment;

    public BonusWorker() {
    }

    public BonusWorker(String name, String position, int workingHours, double sales, double bonusRate, double minPayment) {
        super(name, position, workingHours);
        setSales(sales);
        setBonusRate(bonusRate);
        setMinPayment(minPayment);
    }

    public double getSales() {
        return this.sales;
    }

    public double getBonusRate() {
        return this.bonusRate;
    }

    public double getMinPayment() {
        return this.minPayment;
    }

    public void setSales(double sales) {
        if (sales > 0) {
            this.sales = sales;
        }
    }

    public void setBonusRate(double bonusRate) {
        if (bonusRate > 0) {
            this.bonusRate = bonusRate;
        }
    }

    public void setMinPayment(double minPayment) {
        if (minPayment > 0) {
            this.minPayment = minPayment;
        }
    }

    @Override
    public String toString() {
        return "BonusWorker{" +
                "id=" + id +
                ", name=" + name +
                ", position='" + position +
                ", workingHours=" + workingHours +
                ", sales=" + sales +
                ", bonusRate=" + bonusRate +
                ", minPayment=" + minPayment +
                '}';
    }

    @Override
    public double getSalary() {
        double bonus = sales * bonusRate;
        if (bonus > minPayment) {
            return calculateSalaryAfterTaxes(bonus);
        } else {
            double payment = workingHours >= MIN_WORKING_HOURS ? minPayment : bonus;
            payment = payment >= MIN_SALARY ? payment : MIN_SALARY;
            return calculateSalaryAfterTaxes(payment);
        }
    }
}
