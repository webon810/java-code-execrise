package test4null.javacodetest800.javacodetest100.test4;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test4q64 {
    
    public static void main(String[] args) {

        //exception in main - 2015-01-01 could not be parse
        //LocalDateTime greatDay = LocalDateTime.parse("2015-01-01");

        //with time will works
        LocalDateTime greatDay = LocalDateTime.parse("2015-01-01T17:13:50");
        
        String greatdDayStr = greatDay.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(greatdDayStr);
        
    }
    
}


//output:2015-01-01T17:13:50
