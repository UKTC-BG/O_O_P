package TEMP_STAT;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;


// CLASS ------ GREG-CALENDAR ------

class GregorianCal
{

    public static final int SIZE = 365; // константа Дни в годината



    // MAIN ---BEGIN------------------------------------------------------
    public static void main(String[] args)
    {
        //  TODO Auto-generated method stub
        //      GregorianCalendar date = new GregorianCalendar(2020,0,1);
        //      System.out.println(dateToStr(date));
        //      System.out.println(dateToStr(addOneDay(date)));
        //      System.out.println(dateToStr(date));
        //      Temperature temp = new Temperature(23.4,8,10,2020);
        //      System.out.println(temp);

        // Масив от обекти от клас Температури
        Temperatures[] data = initTemperatures();

        printTemperatures(data);
    }
// MAIN - END-----------------------------------------------------------




// METHOD initTempr

    public static Temperatures[] initTemperatures()
    {
        Temperatures[] data = new Temperatures[SIZE];
        // масив от обекти от клас Temperature с 365 елемента

        GregorianCalendar date = new GregorianCalendar(2020,0,1);

        Random rand = new Random();

        int sign = 1;

        for(int i = 0; i < data.length; i++, sign*=(-1))  // смяна на плюс и минус
        {
            // генератор на случайни числа и делене на 10.
            double temp = Math.round(rand.nextDouble()*100)/10.+sign*20;
        //          data[i] = new Temperature(temp,date.get(Calendar.DATE),
        //          date.get(Calendar.MONTH),date.get(Calendar.YEAR));
            data[i] = new Temperatures(temp,date);
            date = addOneDay(date);
        } // Край на фор цикъл
        return data;
    }// край на метода ИнитТемп



    // Метод за разпечатване на Температурите
    public static void printTemperatures(Temperatures[] data)
    {
        // Хитър начин за разпечатване на масив без цикъл
        System.out.println(Arrays.toString(data));
    }


    // Метод за преобр на дати към стринг
    public static String dateToStr(GregorianCalendar date)
    {
        SimpleDateFormat temp = new SimpleDateFormat("dd.MM.yyyy");
        return temp.format(date.getTime());
    }

    public static GregorianCalendar addOneDay(GregorianCalendar date)
    {
        GregorianCalendar temp = new GregorianCalendar(
                date.get(Calendar.YEAR),
                date.get(Calendar.MONTH),
                date.get(Calendar.DATE));
        temp.add(Calendar.DATE, 1);
        return temp;
    }
}