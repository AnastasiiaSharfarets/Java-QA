package model;

public class SalaryWorker extends Employee {
    private double rate;

    public SalaryWorker() {
    }

    public SalaryWorker(String name, String position, int workingHours, double rate) {
        super(name, position, workingHours);
        if (rate >= 8) {
            this.rate = rate;
        }
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (rate >= 8) {
            this.rate = rate;
        }
    }

    @Override
    public double getSalary() {
        return calculateSalaryAfterTaxes(workingHours * rate);
    }

    @Override
    public String toString() {
        return "SalaryWorker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", workingHours=" + workingHours +
                ", rate=" + rate +
                '}';
    }
}
