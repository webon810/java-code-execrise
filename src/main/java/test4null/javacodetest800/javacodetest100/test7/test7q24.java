package test4null.javacodetest800.javacodetest100.test7;

import java.util.ArrayList;

public class test7q24 {
    
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> al = new ArrayList<String>();
        al.add("111");
        al.add("222");
        
        //exception in main - indexOutOfBoundsException - size = 2
        //System.out.println(al.get(al.size()));

        //this output 222
        System.out.println(al.get(1));
        
    }
    
}
