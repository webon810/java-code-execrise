package test4null.javacodetest800.javacodetest100.test1;

class q63Baap {
    public int h = 4;
    public int getH() {
        System.out.println("q63Baap " + h);
        return h;
    }
}

public class test1q63 extends q63Baap {
    
    public int h = 44;
    public int getH() {
        System.out.println("test1q63 " + h);
        return h;
    }
    public static void main(String[] args) {
        q63Baap b = new test1q63();
        System.out.println(b.h + " " + b.getH());
        
        test1q63 bb = (test1q63) b;
        System.out.println(bb.h + " " + bb.getH());
        
    }
    
}


//output
//tset1q63 44
//4 44
//test1q63 44
//44 44


