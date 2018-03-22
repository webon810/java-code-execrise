package test4null.javacodetest800.javacodetest100.test5;


class q42XXX {
    
    public void m() throws Exception {
        throw new Exception();
    }
    
}


public class test5q42 extends q42XXX {

   public void m(){}
    
    public static void main(String[] args) {
        
       //this is will need to throws exception
       //test5q42 obj = new q42XXX();

        //this is valid no need throws exception
        test5q42 obj = new test5q42();
       
       obj.m();
       
        //System.out.println();
        
    }
    
}
