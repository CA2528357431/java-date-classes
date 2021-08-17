// SimpleDateFormat

// 英文字母 全 用于指示模式

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class new02 {
    public static void main(String[] args){

        SimpleDateFormat sdf1 = new SimpleDateFormat();
        // 默认模式构造

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年  MM月  dd日  HH时  mm分  ss秒");
        // 指定模式构造
        // 一个字母即可表示对应量
        // 但字母数量可以设置额外宽度
        // 一个M 月份是 8            两个M 月份是 08
        // 一个y 月份是 2020         五个y 月份是 02020
        // *****推荐把位数写满*****


        // date-->String
        Date d = new Date();
        String str = sdf1.format(d);
        System.out.println(str);

        str = sdf2.format(d);
        System.out.println(str);


        // 根据模式的字符串生成Date
        String source = "1999年  12月  30日  23时  58分  46秒";
        // 必须用try
        try {
            Date neo = sdf2.parse(source);
            System.out.println(neo);
        } catch (ParseException e){
            e.printStackTrace();
        }




    }
}
