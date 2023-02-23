package chepter10;

import homework.employee.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D {
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static String dateToString (Date sdf){
        if (simpleDateFormat == null) {

            return null;
        }
        return simpleDateFormat.format(simpleDateFormat);
    }



    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(simpleDateFormat);



        String str = DateUtil.dateToString(date);

        System.out.println(str);

        String [] str1 = str.split("/");
        System.out.println(str1[0]);

    }




}
