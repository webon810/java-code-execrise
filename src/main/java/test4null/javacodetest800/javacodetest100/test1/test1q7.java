package test4null.javacodetest800.javacodetest100.test1;

public class test1q7 {
    
    public void SwitchString(String input) {
        
        switch (input) {
            case "a": System.out.println("apple");
            case "b": System.out.println("bat");
            break;
            case "B": System.out.println("big bat");
            default: System.out.println("none");
        }
        
    }
    
    
    public static void main(String[] args) throws Exception {
        
        //creat the reference, then able to access different method 
        // under same class 
        test1q7 tc = new test1q7();
        tc.SwitchString("B");
        
        //System.out.println("...");
    }
    
    //output: big bat none
    
    
    
}
