package test4null.javacodetest800.javacodetest100.test5;

public class test5q34 {
    
    public void m(int a){
        
        System.out.println("In int ");
    }
    
    public void m(char c){
        
        System.out.println("In char ");
        
    }
    
    public static void main(String[] args){
        
        test5q34 n = new test5q34();
        
        int a = 'a';
        char c = 6;
        
        n.m(a);
        n.m(c);
        
    }
    
}


//output :  In int In char

// Remember that whenever two methods are applicable for a method call, 
// the one that is most specific to the argument is chosen.