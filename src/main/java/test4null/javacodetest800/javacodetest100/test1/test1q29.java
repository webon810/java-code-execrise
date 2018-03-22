package test4null.javacodetest800.javacodetest100.test1;

class q29A {
    
    int i=10;
    int m1() {
        return i;
    }
}
class q29B extends q29A {
    int i = 20;
    int m1() {
        return i;
    }
}
class q29C extends q29B {
    int i =30;
    int m1() {
        return i;
    }
}

public class test1q29 {
    
    public static void main(String[] args) {
        
        q29A o1 = new q29C();
        q29B o2 = (q29B) o1;
        
        System.out.println(o1.m1());
        System.out.println(o2.i);
        
    }
    
}


//output: 30 20