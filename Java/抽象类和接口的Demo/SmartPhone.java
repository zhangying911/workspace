public class SmartPhone extends Telephone implements IPlayGame{
    //必须重写父类抽象方法
    @Override
    public void call() {
        System.out.println("智能手机可以通过语音打电话");
    }

    @Override
    public void message() {
        System.out.println("智能手机可以通过语音发短信");
    }

    @Override
    public void playGame() {
        System.out.println("智能手机具有了玩游戏的功能");
    }
}
