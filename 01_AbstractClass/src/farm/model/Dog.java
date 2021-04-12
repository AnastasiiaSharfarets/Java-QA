package farm.model;

public abstract class Dog extends Animal {
    private boolean isAGoodDog;
    protected Paw[] paws = new Paw[4];

    public Dog() {
    }

    public Dog(String name, double age, double weight, boolean gender, boolean isAGoodDog) {
        super(name, age, weight, gender);
        this.isAGoodDog = isAGoodDog;
        paws[0] = new Paw("front left");
        paws[1] = new Paw("front right");
        paws[2] = new Paw("back left");
        paws[3] = new Paw("back right");
    }

    public boolean isAGoodDog() {
        return this.isAGoodDog;
    }

    public void setIsAGoodDog(boolean isAGoodDog) {
        this.isAGoodDog = isAGoodDog;
    }

    @Override
    public void voice() {
        System.out.println("Woof woof");
    }

    @Override
    public abstract void benefit();

    public abstract Paw getPaw ();

    @Override
    public String printInfo() {
        return super.printInfo() + ", is a good dog: " + isAGoodDog;
    }

}