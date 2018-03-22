package test4null.javacodetest800.javacodetest100.test7;

public class test7q8 {
    
    public static void main(String[] args){
        
        //this cannot move here either - or error - variable exist already
        // or matter of scope
        //int i = 20;
        
        //this print 0-9
        for (int i=0; i<10; i++)  System.out.println(i + " ");
        
        //this not print anything - but valid
        for (int i=10; i>10; i--) System.out.print(i + " ");
        
        //this comment out will error - no variable founds
        int i = 20;
        
        //this line cannot move up int i=20, or error
        System.out.print(i + " ");
        
    }
    
    
}
