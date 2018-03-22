package test4null.javacodetest800.javacodetest100.test2;

class q56A {
    
    //this print() method is override in sub-class
    q56A(){ print();}
    void print() { System.out.println("A");}
}


public class test2q56 extends q56A {
    int i = 4;
    public static void main(String[] args){
        q56A a = new test2q56();
        a.print();
        //System.out.println("Hello");
    }
    void print() { System.out.println(i);}
}
