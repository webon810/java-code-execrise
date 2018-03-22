package test4null.javacodetest800.javacodetest100.test5;

import java.util.ArrayList;
import java.util.List;

public class test5q13 {
    
    public static void main(String[] args) throws Exception {
        
        List list = new ArrayList();
        
        list.add("val1");
        
        //here need 1 or will exception in main - indexOutOfBound
        list.add(1, "val2");
        list.add(2, "val3");
        
        System.out.println(list);
        
    }
    
}

//output: [val1, val2, val3]