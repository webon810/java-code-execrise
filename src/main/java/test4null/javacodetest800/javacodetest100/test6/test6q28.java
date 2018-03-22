package test4null.javacodetest800.javacodetest100.test6;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class test6q28 {
    
    public static void main(String[] args) {
        
        //System.out.println(LocalDate.of(2015, Month.JANUARY, 01).format(DateTimeFormatter.ISO_DATE_TIME));
        
        //this is valid
        System.out.println(LocalDate.of(2015, Month.JANUARY, 01).format(DateTimeFormatter.ISO_DATE));
    }
    
    
}

//output: 2015-01-01