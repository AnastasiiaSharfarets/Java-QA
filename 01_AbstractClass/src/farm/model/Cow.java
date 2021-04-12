package farm.model;

public class Cow extends farm.model.Cattle {
    public Cow() {
    }

    public Cow(String name, double age, double weight, boolean gender, boolean horns) {
        super(name, age, weight, gender, horns);
    }

    @Override
    public String reactionToDanger(boolean feelsInDanger) {
        return feelsInDanger ? "MOOOO!" : "";
    }

    @Override
    public void voice() {
        System.out.println("Moo-Moo");
    }

    @Override
    public void benefit() {
        System.out.println("I give milk");
    }
}
