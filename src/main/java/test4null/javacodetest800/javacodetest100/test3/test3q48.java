package test4null.javacodetest800.javacodetest100.test3;

class q48Base {
    
    void methodA() {
        
        System.out.println("base - MethodA");
    }
    
}

public class test3q48 extends q48Base {
    
    public void methodA() {
        
        System.out.println("Sub - MethodA");
        
    }
    
    public void methodB() {
        
        System.out.println("Sub - MethodB");
    }
    
    public static void main(String[] args) {
        q48Base b = new test3q48();
        b.methodA();
        //not able to reference methodB() here
        //b.methodB();
    }
    
}


//output: base - MethodA
//need to comment out the b.methodB()