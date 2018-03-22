package test4null.javacodetest800.javacodetest100.test3;

public class test3q1 {
    
    public static void main(String[] args) {
        
        q1B c = new q1C();
        System.out.println(c.max(10,20));
        
    }
    
}

class q1A {
    
    int max(int x, int y) {
        if(x > y) return x;
        else return y;
    }
}
class q1B extends q1A {
    int max(int x, int y) {
        return 2 * super.max(x,y);
    }
}
class q1C extends q1B {
    int max(int x, int y) {
        return super.max(2*x, 2*y);
    }
    
}


//output: 80