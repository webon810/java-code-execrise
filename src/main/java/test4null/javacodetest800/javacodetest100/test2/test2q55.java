package test4null.javacodetest800.javacodetest100.test2;


class q55A {
    
    int i;
    public q55A(int x){ this.i = x; }

    public void print() {
    }
}

public class test2q55 extends q55A {
    
    int j;
    
    public test2q55(int x, int y){
        super(x);
        this.j = y;
    }
    
    public static void main(String[] args){
        System.out.println("Hello");
    }
    
    //newly add these code here
    //option1
    //test2q55(int y){
     //   super(y*2);
       // j = y;
    //}
    
    //option2
    test2q55(int z){
        this(z, z);
    }
    
}
