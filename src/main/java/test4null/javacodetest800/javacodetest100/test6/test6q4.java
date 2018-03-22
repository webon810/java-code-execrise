package test4null.javacodetest800.javacodetest100.test6;

import java.time.LocalDate;
import java.time.Period;

public class test6q4 {

    //private static Object ld;

    public LocalDate process(LocalDate ld){
        LocalDate ld2 = ld.plus(Period.of(0,1,1));
        return ld2;
    }
    
    public static void main(String[] args){
        
        test6q4 t6q4 = new test6q4();
        
        //LocalDate ld2 = ld.plus(Period.of(0, 1, 1));
        //the following just play around here
        //System.out.println(t6q4.process(LocalDate.of(0,0,0))));
    }
    
    
}

//should do this way - LocalDate ld2 = ld.plus(Period.of(0, 1, 1));




