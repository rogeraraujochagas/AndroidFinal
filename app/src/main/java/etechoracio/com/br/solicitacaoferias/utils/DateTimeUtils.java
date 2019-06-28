package etechoracio.com.br.solicitacaoferias.utils;

import android.widget.Toast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.MonthDay;
import java.util.Calendar;
import java.util.Date;


public class DateTimeUtils {
    public static DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");


    public static String FormatDate(int dia, int mes, int ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(ano, mes, dia);
        return DATE_FORMAT.format(calendar.getTime());
    }


    public static String formatDate(int dia, int mes, int ano) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(ano, mes, dia);
            return DATE_FORMAT.format(calendar.getTime());
        } catch (Exception e) {
            return null;

        }
    }

    public static Date toDate(String date) {
        try {
            return DATE_FORMAT.parse(date);
        } catch (ParseException e) {

            return null;
        }
    }

    public static Date addDay(Date date, int dataferias) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_YEAR, dataferias);
        return cal.getTime();
    }
    public static boolean isMonday (Date data){
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        int day = cal.get(Calendar.DAY_OF_WEEK);
        switch (day){
            case Calendar.MONDAY:
                cal.add(Calendar.DAY_OF_WEEK, 2);
        }

        if (day ==2){
            return  true;
        }
        else {
            return  false;
        }
    }
}
