package test4null.javacodetest800.javacodetest100.test4;

public class test4q7 {
    
    static int MAX = 111;
    
    static final String CLASS_GUID;
   
    // Widget() { }
    // Widget(int k) { }
    
    //add this line to init the values
    static { MAX = 11999; CLASS_GUID = "XYZ123"; }
    
    public static void main(String[] args) {
        
        System.out.println(MAX + " " + CLASS_GUID);
        
    }
    
}
