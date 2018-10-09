public class Truck extends Automobile {
    public Truck(String name, double goods, int rent) {
        super(name, goods, rent);
    }

    @Override
    public void show() {
        System.out.println(name+"    "+rent+"元/天"+"    "+"载货："+goods+"吨");
    }
}
