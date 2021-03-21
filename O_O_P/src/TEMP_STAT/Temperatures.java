package TEMP_STAT;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Temperatures
{
    private double temp;             // поле за температура от примитивен тип дабъл
    private GregorianCalendar date;  // поле за дата от тип клас-ГрегКалендар

    public Temperatures()
    {

    }

    public Temperatures(double temp,int day, int month, int year)
    {
        date = new GregorianCalendar(year,month-1,day);
        this.temp=temp;
    }

    public Temperatures(double temp,GregorianCalendar date)
    {
        this.date = date;
        this.temp=temp;
    }

    public double getTemp() {           // ГЕТЕР ЗА Температура
        return temp;
    }
    public void setTemp(double temp) {  // СЕТЕР за Температура
        if (temp>=-20 && temp<=40) {
            this.temp=temp;
        }
    }
    public GregorianCalendar getDate() {            // ГЕТЕР за Дата
        return date;
    }
    public void setDate(GregorianCalendar date) {   // СЕТЕР за Дата
        this.date = date;
    }
    @Override
    public String toString()
    {
        return dateToStr()  + ", " + temp ;
    }

    public String dateToStr() {           // Пребразува към стринг за печат
        SimpleDateFormat temp = new SimpleDateFormat("dd.MM.yyyy");
        return temp.format(date.getTime());
    }
}