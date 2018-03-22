package test4null.javacodetest800.javacodetest100.test1;


class q23ABCD {
    
    
    //again this need to be static
    static int x = 10;
    static int y = 20;
    
}
class q23MNOP extends q23ABCD {
    
    //this is need static, or error 
    static int x=30;
    static int y= 40;
    
}

public class test1q23 {
    
    public static void main(String[] args) {
        
        //add this reference, q23ABCD will override to MNOP
        //q23ABCD qa = new q23MNOP();
        //System.out.println( qa.x + ", " + qa.y);
        
        System.out.println( q23MNOP.x + ", " + q23MNOP.y);
    }
    
}


//output:  30 40 