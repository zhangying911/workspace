import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Automobile[] automobiles = {
                new Car("奥迪A4",4,500),
                new Car("马自达6",4,400),
                new Car("金龙",28,800),
                new MultiAuto("皮卡雪6",2,3,450),
                new Truck("松花江",5,400),
                new Truck("依维柯",20,1000),
        };

        int[] selectedCars = new int[100];  // 1,2
        int rentDays; // zuche



        System.out.println("欢迎使用嗒嗒租车系统");
        System.out.println("您是否要租车：1是 0否");
        Scanner getChoose = new Scanner(System.in);
        String choose = getChoose.next();
        if(choose.equals("1")){
            System.out.println("您可租车的类型及其价目表：");
            System.out.println("序号  汽车名称   租金    容量");
            for(int i = 0;i < automobiles.length; i++){
                int n = i + 1;
                System.out.print(" "+n+"   ");
                automobiles[i].show();
            }
            System.out.println("请输入您的租车数量：");
            Scanner getNum = new Scanner(System.in);
            //输入租车总数
            int len = getNum.nextInt();
            int[] carArray = new int[len];
            for(int j = 0; j<len; j++){
                int n = j+1;
                System.out.println("请输入第"+n+"辆车的序号");
                carArray[j] = getNum.nextInt();
            }
            System.out.println("请输入租车天数：");
            Scanner getDays = new Scanner(System.in);
            int days = getDays.nextInt();
            System.out.println("您的账单：");

            System.out.println("*****可载人的车有：");
            int totalPerson = 0;
            for (int i = 0; i < carArray.length; i++){
                int selectedCarIndex = carArray[i];
               Automobile automobile = automobiles[selectedCarIndex - 1];
               if(automobile.person > 0) {
                   System.out.print(automobile.name + " ");
                   totalPerson += automobile.person;
               }
            }
            System.out.println("载客总数量："+totalPerson+"人");

            System.out.println("*****可载货的车有：");
            int totalGoods = 0;
            for (int i = 0; i < carArray.length; i++){
                int selectedCarIndex = carArray[i];
                Automobile automobile = automobiles[selectedCarIndex - 1];
                if(automobile.goods > 0) {
                    System.out.print(automobile.name + " ");
                    totalGoods += automobile.goods;
                }
            }
            System.out.println("载货总重量："+totalGoods+"吨");

            System.out.println("*****租车总价格：");
            int totalPrice = 0;
            for (int i = 0; i < carArray.length; i++){
                int selectedCarIndex = carArray[i];
                Automobile automobile = automobiles[selectedCarIndex - 1];
                if(automobile.rent > 0) {
                    //System.out.print(automobile.name + " ");
                    totalPrice += automobile.rent;
                }
            }
            System.out.println(totalPrice*days+"元");
        }else{
            System.out.println("再见");
            System.exit(0);
        }



    }
}
