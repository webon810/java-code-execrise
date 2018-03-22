package test4null.javacodetest800.javacodetest100.test3;

import java.util.ArrayList;
import java.util.List;

public class test3q8 {
    
    public static void main(String[] args) {
        
        List s1 = new ArrayList();
        try {
            
            while (true) {
                s1.add("sdfa");
            }
            
        } catch (RuntimeException re) {
            
            re.printStackTrace();
        }
        
        System.out.println(s1.size());
        
    }
    
}

//It will throw an error at runtime that will not be caught by the catch block.
// it will throw an error at runtime - outOfMemory