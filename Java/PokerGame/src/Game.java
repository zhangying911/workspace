import java.util.*;

public class Game {
    public static void main(String[] args){
        Game round1 = new Game();
        round1.createCard();
        round1.createPlayer();
        round1.washCards();
        round1.distributeCards();
        round1.gameStart();
    }

    //创建扑克牌容器和玩家容器
    List<PokerCard> pokerCards;
    List<Player> players;
    public Game(){
        this.pokerCards = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    //创建扑克牌资源数组，顺序即rank的大小
    String[] cardColor = {"黑桃","红心","梅花","方块"};
    String[] cardValue = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    //创建扑克牌
    public void createCard(){
        System.out.println("***********创建扑克牌...************");
        for (int i = 0; i < cardValue.length; i++) {
            for (int j = 0; j < cardColor.length; j++) {
                pokerCards.add(new PokerCard(cardColor[j],cardValue[i],i*13+j));//PokerCard对象
            }
        }
        System.out.println("***********创建扑克牌成功！************");
        System.out.println("新扑克牌为：");
        for (PokerCard every:pokerCards) {
            System.out.print(every.color+every.value+",");
        }
        System.out.println(" ");
        System.out.println("总共"+pokerCards.size()+"张牌！");
        System.out.println(" ");
    }

    //创建玩家
    //Player对象
    Player player1 = new Player();
    Player player2 = new Player();
    public void createPlayer(){

        Scanner p = new Scanner(System.in);

        System.out.println("请输入玩家1的ID：");
        String p1_id = p.next();
        System.out.println("请输入玩家1的姓名：");
        String p1_name = p.next();
        player1 = new Player(p1_id,p1_name);
        players.add(player1);

        System.out.println("请输入玩家2的ID：");
        String p2_id = p.next();
        System.out.println("请输入玩家2的姓名：");
        String p2_name = p.next();
        player2 = new Player(p2_id,p2_name);
        players.add(player2);

        System.out.println("欢迎玩家："+p1_name);
        System.out.println("欢迎玩家："+p2_name);
        System.out.println(" ");
    }

    //洗牌
    public void washCards(){
        System.out.println("***********开始洗牌。。。*************");
        Collections.shuffle(pokerCards);
        System.out.println("***********洗牌结束！*****************");
        System.out.println(" ");
    }

    //发牌
    public void distributeCards(){
        System.out.println("***********开始发牌。。。*************");

        //Random random = new Random();//随机数构造器

//        int card1 = random.nextInt(pokerCards.size());
//        player1.playerCards.add(pokerCards.get(card1));
//        pokerCards.remove(card1);
        player1.playerCards.add(pokerCards.get(0));
        System.out.println("-------玩家"+player1.name+"拿第一张牌");

//        int card2 = random.nextInt(pokerCards.size());
//        player2.playerCards.add(pokerCards.get(card2));
//        pokerCards.remove(card2);
        player2.playerCards.add(pokerCards.get(1));
        System.out.println("-------玩家"+player2.name+"拿第一张牌");

//        int card3 = random.nextInt(pokerCards.size());
//        player1.playerCards.add(pokerCards.get(card3));
//        pokerCards.remove(card3);
        player1.playerCards.add(pokerCards.get(2));
        System.out.println("-------玩家"+player1.name+"拿第二张牌");

//        int card4 = random.nextInt(pokerCards.size());
//        player2.playerCards.add(pokerCards.get(card4));
        player2.playerCards.add(pokerCards.get(3));
        System.out.println("-------玩家"+player2.name+"拿第二张牌");

        System.out.println("************发牌结束！*************");
        System.out.println(" ");

    }

    public void gameStart(){
        System.out.println("************开始游戏！*************");

        //对玩家各自的两张手牌排序,打印各自的最大手牌
        Collections.sort(player1.playerCards);
        PokerCard player1_Max = player1.playerCards.get(1);
        PokerCard player1_Min = player1.playerCards.get(0);
        System.out.println("玩家："+player1.name+"最大的手牌为："+player1_Max.color+player1_Max.value);
        Collections.sort(player2.playerCards);
        PokerCard player2_Max = player2.playerCards.get(1);
        PokerCard player2_Min = player2.playerCards.get(0);
        System.out.println("玩家："+player2.name+"最大的手牌为："+player2_Max.color+player2_Max.value);

        //比较玩家的最大牌
        if (player1_Max.rank>player2_Max.rank){
            System.out.println("*********玩家"+player1.name+"获胜！**********");
        }else {
            System.out.println("*********玩家"+player2.name+"获胜！**********");
        }

        //打印玩家所有的手牌
        System.out.println(" ");
        System.out.println("玩家各自的手牌为：");
        System.out.println(player1.name+":["+player1_Max.color+player1_Max.value+","+player1_Min.color+player1_Min.value+"]");
        System.out.println(player2.name+":["+player2_Max.color+player2_Max.value+","+player2_Min.color+player2_Min.value+"]");
        System.out.println("***********游戏结束！**********");
    }

}
