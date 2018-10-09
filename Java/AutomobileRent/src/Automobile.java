public abstract class Automobile {
    String name;//车名
    int person;//载客量
    double goods;//载货量
    int rent;//租金

    //客车构造方法
    public Automobile(String name,int person,int rent){
        this.name = name;
        this.person = person;
        this.rent = rent;
    }

    //货车构造方法
    public Automobile(String name,double goods,int rent){
        this.name = name;
        this.goods = goods;
        this.rent = rent;
    }

    //两用车构造方法
    public Automobile(String name,int person,double goods,int rent){
        this.name = name;
        this.person = person;
        this.goods = goods;
        this.rent = rent;
    }

    public abstract void show();
}
