public abstract class CarDecorator implements Car {

    private Car decoratedCar;

    public CarDecorator(Car decoratedCar){
        this.decoratedCar = decoratedCar;
    }

    @Override
    public String getAcessories() {
        return decoratedCar.getAcessories();
    }

    @Override
    public int getPrice() {
        return decoratedCar.getPrice();
    }
}
