package test4null.javacodetest800.javacodetest100.test5;

public class test5q37 {
    
    public static void main(String[] args) {

        //need reference here or not able to reference InitClass
        test5q37 t5q37 = new test5q37();

        //System.out.println("...");
        //InitClass obj = new InitClass;
        t5q37.InitClass(5);
        
    }
    
    //need void here
    public  void InitClass(int m) {
        System.out.println(i1 + " " + i2 + " " + x + " " + j + " " + m);
    }
    
    int m;
    static int i1 = 5;
    static int i2;
    int j = 100;
    int x;
    
    { j=30; i2=40; }  //instance init
    static { i1 ++; } //Static init
    
}


//output: 6 40 0 30 5