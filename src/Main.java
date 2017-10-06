public class Main {

    public static void main(String[] args){
        Car car = new SportEdition(new ExpandableRooftop(new BasicCar()));

        System.out.println("Accessories: " + car.getAcessories());
        System.out.println("Price: " + car.getPrice());

        Car car1 = new ExpandableRooftop(new BasicCar());

        System.out.println("Accessories: " + car1.getAcessories());
        System.out.println("Price: " + car1.getPrice());
    }
}

