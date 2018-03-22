package test4null.javacodetest800.javacodetest100.test6;


class q8A {
    
    public int getCode(){ return 2;}
}

class q8AA extends q8A {
    //here cause not able to override since different type
    //public long getCode(){ return 30;}
    public int getCode(){ return 3;}
}


public class test6q8 {
    
    public static void main(String[] args) throws Exception{
        
        q8A a = new q8A();
        q8A aa = new q8AA();
        System.out.println(a.getCode() + " " + aa.getCode() );
        
    }

    //it seems no matter here
    public int getCode() { return 1; }
    
}

//
//output: 20 30