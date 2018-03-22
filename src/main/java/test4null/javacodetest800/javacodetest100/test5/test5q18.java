package test4null.javacodetest800.javacodetest100.test5;

public class test5q18 {
    
    char c;
    
    public void m1() {
        char[] cA = {'a', 'b'};
        
        //call m2 here
        m2(c, cA);
        
        
        //this c is reference with char c, so it is default value 0
        System.out.println((int)c + "," + cA[1]);
    }
    
    public void m2(char c, char[] cA) {
        
        //looks like c here doesn't matter ?
        c = 'b';
        cA[1] = cA[0] = 'm';
    }
    
    public static void main(String[] args){
        
        new test5q18().m1();
    
        //System.out.println("...");
    }
    
    
}

//c is a primitive type and it is pass by value
//output: 0,m