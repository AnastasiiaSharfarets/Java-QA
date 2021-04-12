package farm.model;

public class Cat extends Animal {
    public Cat(){
    }
    public Cat(String name,double age, double weight, boolean gender){
        super(name,age,weight,gender);
    }
    @Override
    public void voice(){
        System.out.println("Meow meow");
    }

    @Override
    public void benefit(){
        System.out.println("I catch mice");
    }

}
