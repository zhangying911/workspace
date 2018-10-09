public class MultiAuto extends Automobile {
    public MultiAuto(String name, int person, double goods, int rent) {
        super(name, person, goods, rent);
    }

    @Override
    public void show() {
        System.out.println(name+"    "+rent+"元/天"+"    "+"载人："+person+"人，"+"载货："+goods+"吨");
    }
}
