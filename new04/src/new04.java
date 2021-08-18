// Calendar 属性

import java.util.Calendar;

public class new04 {
    public static void main(String[] args){
        Calendar rightnow = Calendar.getInstance();

        int hour = rightnow.get(Calendar.HOUR_OF_DAY);
        int min = rightnow.get(Calendar.MINUTE);
        int sec = rightnow.get(Calendar.SECOND);
        System.out.println(String.format("%d时 %d分 %d秒",hour,min,sec));

        rightnow.add(Calendar.HOUR_OF_DAY,3);
        rightnow.add(Calendar.MINUTE,-10);
        // 修改时间

        hour = rightnow.get(Calendar.HOUR_OF_DAY);
        min = rightnow.get(Calendar.MINUTE);
        sec = rightnow.get(Calendar.SECOND);
        System.out.println(String.format("%d时 %d分 %d秒",hour,min,sec));








        int year = rightnow.get(Calendar.YEAR);
        int month = rightnow.get(Calendar.MONTH)+1;  // 月份从0开始
        int date = rightnow.get(Calendar.DAY_OF_MONTH);
        System.out.println(String.format("%d年 %d月 %d日",year,month,date));

        rightnow.set(Calendar.DATE,1);
        // set时间
        // 所有参数都是动态的
        // 我修改date，而DAY_OF_MONTH也变

        year = rightnow.get(Calendar.YEAR);
        month = rightnow.get(Calendar.MONTH)+1;  // 月份从0开始
        date = rightnow.get(Calendar.DAY_OF_MONTH);
        System.out.println(String.format("%d年 %d月 %d日",year,month,date));


    }

}
