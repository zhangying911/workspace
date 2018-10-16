public class Initial {
    public static void main(String[] args){
        //父类引用指向子类对象
        Telephone tel1 = new Cellphone();
        tel1.call();
        tel1.message();
        Telephone tel2 = new SmartPhone();
        tel2.message();
        tel2.call();
        //接口的引用指向实现了接口的对象
        IPlayGame ip1 = new SmartPhone();
        IPlayGame ip2 = new Psp();
        ip1.playGame();
        ip2.playGame();
        //或者通过已经实例化的对象来直接调用接口
        //((SmartPhone) tel2).playGame();
        // 或者先通过类new一个对象再调用接口
        //Psp psp1 = new Psp();
        //psp1.playGame();

        //通过匿名内部类来实现接口
        IPlayGame ip3 = new IPlayGame(){
            @Override
            public void playGame() {
                System.out.println("通过匿名内部类实现接口");
            }
        };//匿名内部类要以分号结束
        //接口的引用直接调用方法
        ip3.playGame();
    }
}
