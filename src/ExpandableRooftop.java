public class ExpandableRooftop extends CarDecorator{

    public ExpandableRooftop(Car decoratedCar){
        super(decoratedCar);
    }

    @Override
    public String getAcessories(){
        return super.getAcessories() + " with Expandable Rooftop ";
    }

    @Override
    public int getPrice(){
        return super.getPrice() + 300;
    }

}
