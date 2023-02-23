package homework.medicalCenter.util;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateUtil {
    public static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    public static final SimpleDateFormat SDF1 = new SimpleDateFormat("dd");


    public static String dateToString (Date date){
        if (date == null){
            return null;
        }
        return SDF.format(date);
    }

    public static Date stringToDate(String dateStr) {
        if (dateStr == null){
            return null;
        }
        try {
            return SDF.parse( dateStr);
        }catch (ParseException e) {
            System.out.println("invalid date format");
        }
        return null;
    }


}
