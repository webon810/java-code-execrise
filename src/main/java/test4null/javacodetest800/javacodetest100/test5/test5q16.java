package test4null.javacodetest800.javacodetest100.test5;


class q16Super {
    static  String ID = "QBANK";
}


//if extends here, q16Sub can all ID without super
class q16Sub extends q16Super {

    static {System.out.println("In Sub");}
}


public class test5q16 {
    
    public static void main(String[] args) {
        
        System.out.println(q16Sub.ID);
        
    }
    
}
