// Date

// 毫秒精度类

import javax.xml.crypto.Data;
import java.util.Date;

public class new01 {
    public static void main(String[] args){

        Date d1 = new Date();
        System.out.println(d1);
        // 目前时间
        // 时区来自系统

        Date d2 = new Date(1000);
        System.out.println(d2);
        // 指定时间

        long ti = d1.getTime();
        System.out.println(ti);
        // 获取时间戳数值

        d2.setTime(100);
        ti = d2.getTime();
        System.out.println(ti);
        // 重设时间戳








    }

}
