public class BasicCar implements Car {

    @Override
    public String getAcessories(){
        return "Basic Accessories";
    }

    @Override
    public int getPrice(){
        return 5000;
    }

}
