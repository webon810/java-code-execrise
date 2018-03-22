package test4null.javacodetest800.javacodetest100.test5;

public class test5q29 {
    
    String s1 = "green mile";
    String local;
    
    public void generateReport(int n){

        //this is local variable not able to init by JVM, need
        //move out of method become member variable, then JVM init a default value 
        //String local;
        
        if(n>0) local = "good";
        else local ="bad";
        System.out.println(s1 + " " +local);
        
    }
    
    public static void main(String[] args) {
        
        //create the reference object here
        test5q29 gr = new test5q29();
        
        //assign the value to n
        gr.generateReport(-90);
        
        //System.out.println("..." + gr.generateReport(10));
        
    }
    
    
}

//about difference of local variable and member variable