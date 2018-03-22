package test4null.javacodetest800.javacodetest100.test6;

class q70A {
    
    //private int i = 15;  //if private here - it is not accessible
    public int i = 15;
    
    public void f(){}
    public void g(){}
    
}

class q70B extends q70A {
    
    public int i = 50;
    public void g(){}
    
}

public class test6q70 {
    
    public static void main(String[] args){

        q70A a = new q70A();
        
        //for this works - need to change private to public - accessible
        q70A b = new q70B(); //b.i is 15 then
        
        //q70B b = new q70B();  //b.i is 50
        
        System.out.println(b.i);
    }
    
}


//if you declare b to be of type B i.e. B b = new B();, you can access b.i.