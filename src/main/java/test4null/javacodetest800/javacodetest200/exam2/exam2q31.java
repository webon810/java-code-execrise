package test4null.javacodetest800.javacodetest200.exam2;

abstract class A1 {
    
    public abstract void m1();
    public void m2() {
        System.out.println("Green");
    }
}

abstract class A2 extends A1 {
    
    public abstract void m3();
    public void m1() {
        System.out.println("Cyan");
    }
    public void m2() {
        System.out.println("Blue");
    }

}

class A3 extends A2 {
    
    
    public void m1() {
        System.out.println("Yellow");
    }

    public void m2() {
        System.out.println("Pink");
    }

    public void m3() {
        System.out.println("Red");
    }
}

public class exam2q31 { 
    
    public static void main(String[] args) {
        A2 tp = new A3();
            
        //((A2)tp).m2();
        tp.m1();
        tp.m2();
        tp.m3();
            //((A3)tp).m1();
            //((A3)tp).m2();
            //((A3)tp).m3();
        }
    }

   
//output: Yellow Pink Red