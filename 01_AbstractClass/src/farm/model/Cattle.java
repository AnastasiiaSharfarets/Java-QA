package farm.model;

public abstract class Cattle extends Animal {
    private boolean horns;

    public Cattle() {
    }

    public Cattle(String name, double age, double weight, boolean gender, boolean horns) {
        super(name, age, weight, gender);
        this.horns = horns;
    }

    public String hasHorns() {
        String strHorns = horns ? "has horns" : "hasn't horns";
        return strHorns;
    }

    public void setHorns(boolean horns) {
        this.horns = horns;
    }

    public abstract String reactionToDanger(boolean feelsInDаnger);

    @Override
    public String printInfo() {

        return super.printInfo() + ", Horns: " + horns;
    }
}
