package test4null.javacodetest800.javacodetest100.test1;


class q45Base {
    
    public short getValue(){ return 1; }
    
}

class q45Base2 extends q45Base {

    //overriding need same data type or error - cast
    //public byte getValue() { return 2; }
    
    public short getValue() { return 2; }
}


public class test1q45 {
    
    public static void main(String[] args) {
        
        q45Base b = new q45Base2();
        System.out.println(b.getValue());
        
    }
    
}
