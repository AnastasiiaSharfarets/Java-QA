package farm.model;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    private double age;
    private double weight;
    private boolean gender;
    private Chip chip;

    public Animal() {}

    public Animal(String name, double age, double weight, boolean gender) {
        if (name.isEmpty()) {
            this.name = "Default name";
        } else {
            this.name = name;
        }
        setAge(age);
        setWeight(weight);
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        // !true = false
        // !false = true
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public double getAge() {
        return this.age;
    }

    public void setAge(double age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public boolean isGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String printInfo() {
        String strGender = gender ? "" : "";
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight + ", Gender: " + gender;
    }

    public String getChip() {
        return chip.toString();
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }
    @Override
    public boolean equals(Object object){
        //====1======
        if (this == object){
            return true;
        }
        //====2======
        if(!(object instanceof Animal)){
            return false;
        }
        //====3======
        Animal animal = (Animal)object;
        return this.name.equals(animal.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }

    public abstract void voice();

    public abstract void benefit();

}
