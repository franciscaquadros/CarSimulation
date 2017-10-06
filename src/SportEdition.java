public class SportEdition extends CarDecorator {

    public SportEdition(Car decoratedCar){
        super(decoratedCar);
    }

    @Override
    public String getAcessories(){
        return super.getAcessories() + "and Sport Edition";
    }

    @Override
    public int getPrice(){
        return super.getPrice() + 600;
    }
}
