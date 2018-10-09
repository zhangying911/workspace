public class Car extends Automobile {
    public Car(String name, int person, int rent) {
        super(name, person, rent);
    }

    @Override
    public void show() {
        System.out.println(name+"    "+rent+"元/天"+"    "+"载人："+person+"人");
    }
}
