import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest {
    public static void main(String[] args) throws ParseException {
        //创建Date对象，表示当前时间
        Date now = new Date();

        //创建SimpleDateFormat对象，指定目标格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //调用format()方法，将日期转换为字符串并输出
        System.out.println(sdf1.format(now));
        System.out.println(sdf2.format(now));
        System.out.println(sdf3.format(now));

        // 创建日期格式的字符串
        String str = "2018-6-1 09:11:11";

        //创建SimpleDateFormat对象，指定目标格式
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //调用parse()方法，将字符串转换为日期并输出
        System.out.println(sdf4.parse(str));

    }
}
