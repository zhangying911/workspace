
public class PokerCard implements Comparable<PokerCard> {
    String color;
    String value;
    int rank;//扑克牌等级
    public PokerCard(){

    }
    public PokerCard(String color,String value,int rank){
        this.color = color;
        this.value = value;
        this.rank = rank;
    }


    @Override
    public int compareTo(PokerCard o) {

        return this.rank - o.rank;
    }
}
