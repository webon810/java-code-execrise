package test4null.javacodetest800.javacodetest100.test1;

class q38Super {}

class q38Sub extends q38Super {}

public class test1q38 {
    
    public static void main(String[] args) {
        
        q38Super s1 = new q38Super();
        q38Sub s2 = new q38Sub();
        s1 = (q38Super)s2;
        
        //System.out.println("...");
    }
    
}


//output:  it compile
