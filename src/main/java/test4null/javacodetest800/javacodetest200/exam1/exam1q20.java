package test4null.javacodetest800.javacodetest200.exam1;

class q20A {

    //constructor name same as class name
    public q20A() {
        System.out.println("A ");
    }
}

class q20B extends q20A {

    public q20B() {
        System.out.println("B ");
    }

}

public class exam1q20 extends q20B {
    
    
    public exam1q20() {
        System.out.println("C ");
        
    }

    public static void main(String[] args) {
        exam1q20 c = new exam1q20();
    }
    
}


//output: A B C
