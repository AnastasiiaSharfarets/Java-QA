package farm.model;

public class ExpoDog extends Dog{
    public ExpoDog(){}
    public ExpoDog(String name, double age, double weight, boolean gender, boolean isAGoodBoy){
        super(name,age,weight,gender,isAGoodBoy);
    }
    @Override
    public void benefit(){
        System.out.println("I am for selling");
    }

    @Override
    public Paw getPaw(){
      return paws[0];
    }
}
