package test4null.javacodetest800.javacodetest100.test5;

public class test5q22 {
    
    class SomeException extends Exception{}
    
    static class q22A { protected void m() throws SomeException {}}
    static class q22B extends q22A { public void m() { } }
    
    public static void main(String[] args) throws Exception{
        
        q22A a = new q22B();
        
        //this is valid
        ((q22B)a).m();
        
        //q22B b = new q22B();
        
        //String aa = (q22B)a.m();
        
        System.out.println("...");
    }
    
    
}

//this one confused (q22B)a.m(); -- seems no matter here