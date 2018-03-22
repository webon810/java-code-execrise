package test4null.javacodetest800.javacodetest100.test4;


class q2A {
    final int fi = 10;
}


//need to extends q2A here, or error 
public class test4q2 extends q2A {

    int fi = 15;
    
    public static void main(String[] args) {
        
        test4q2 b = new test4q2();
        
        b.fi = 20;
        
        System.out.println(b.fi);
        
        //base class q2A override sub class 
        System.out.println( ((q2A)b).fi  );
        
    }
    
}



//output: 20 10