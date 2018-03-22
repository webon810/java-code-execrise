package test4null.javacodetest800.javacodetest100.test5;

public class test5q5 {
    
    public static void main(String[] args){
        
        Object a,b,c;
        a = new String("A");
        b = new String("B");
        c = a;
        a = b;
        
        System.out.println("..." + c);
    }
}

//output: A