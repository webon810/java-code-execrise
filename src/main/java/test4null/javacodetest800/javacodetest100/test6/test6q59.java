package test4null.javacodetest800.javacodetest100.test6;


class q59A {
    
    public int i = 10;
    private int j = 20;
    
}

class q59B extends q59A {
    
    private int i = 30;
    public int k = 40;
    
}

class q59C extends q59B {
    
}

public class test6q59 {
    
    public static void main(String[] args){
        
        q59C c = new q59C();
        
        //comment out or error private access
        //System.out.println(c.i);
        //System.out.println(c.j);
        System.out.println(c.k);
    }
    
    
}


//output is 40