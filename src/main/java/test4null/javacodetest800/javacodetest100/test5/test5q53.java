package test4null.javacodetest800.javacodetest100.test5;


interface q53I {
    
}

class q53A implements q53I {}

class q53B extends q53A {}

public class test5q53 extends q53B {
    
    public static void main(String[] args) {
        
        q53A a = new q53A();
        q53B b = new q53B();
        
        a = (q53B)(q53I)b;
        
        //it will not compile
        //a  = (q53I)b;
        
        //System.out.println("...");
        
    }
}


//Since B is-a A, it can be assigned to a.