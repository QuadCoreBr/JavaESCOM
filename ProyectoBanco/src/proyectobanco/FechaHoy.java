import java.util.*;
 
public class FechaHoy{
     
    public static void main(String [] args){
        /*
        Date d = new Date();
     
        String hoy = new String(d.toString());
        System.out.println("Fecha de Hoy: " + hoy);
        */
         
        //Formato para trabajar con calendario gregoriano
        Calendar calendar = new GregorianCalendar();
        //Fecha y hora actual
        Date trialTime = new Date();
        //pasamos la fecha y hora actual para trabajar en el formato del calendaro gregoriano
        calendar.setTime(trialTime);
 
        // Obteneindo la información interesante
        System.out.println("ERA: " + calendar.get(Calendar.ERA));
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("DATE: " + calendar.get(Calendar.DATE));
        System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_WEEK_IN_MONTH: "
                    + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
         
        //Para determinar si el año es bisiesto
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("LEAP YEAR (2000): " + gc.isLeapYear(2000
        ));
  
  
    }
}