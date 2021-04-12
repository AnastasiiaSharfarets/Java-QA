package farm.model;

public class ServiceDog extends Dog {
    public ServiceDog() {
    }

    public ServiceDog(String name, double age, double weight, boolean gender, boolean isAGoodBoy) {
        super(name, age, weight, gender, isAGoodBoy);
    }

    @Override
    public void benefit() {
        System.out.println("I defend the farm");
    }

    @Override
    public Paw getPaw() {
        //(int)(min+Math.random()*(max+1-min))
        //(int)(Math.random()*(max+1))
        int randomPaw = (int) (Math.random() * (3 + 1));
        return paws[randomPaw];
    }
}
