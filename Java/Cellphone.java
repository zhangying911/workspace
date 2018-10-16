public class Cellphone extends Telephone {
   //必须重写父类抽象方法
    @Override
    public void call() {
        System.out.println("按键手机通过键盘来打电话");
    }

    @Override
    public void message() {

        System.out.println("按键手机通过键盘来发短信");
    }
}
