package test4null.javacodetest800.javacodetest200.exam2;

public class exam2q72 {
    
    public static void main(String[] args){
        
        q72AnotherSampleClass asc = new q72AnotherSampleClass();
        exam2q72 sc = new exam2q72();
        
        System.out.println("sc " + sc.getClass());
        System.out.println("asc " + asc.getClass());
    
    }
    
}

class q72AnotherSampleClass extends  exam2q72 {}


//output: 
//sc class exam2q72
//asc class q72anothersampleclass