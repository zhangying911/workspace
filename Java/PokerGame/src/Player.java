import java.util.ArrayList;
import java.util.List;

public class Player {
    String id;
    String name;
    List<PokerCard> playerCards;

    public Player() {
    }

    public Player(String id, String name){
        this.id = id;
        this.name = name;
        this.playerCards = new ArrayList<>();
    }

}
