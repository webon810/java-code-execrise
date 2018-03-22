package test4null.javacodetest800.javacodetest100.test6;

import java.time.LocalDate;

public class test6q24 {
    
    public static void main(String[] args){

        LocalDate dt = LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1);
        System.out.println(dt);
        
    }
    
}


//output: 2015-11-30