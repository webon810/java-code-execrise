package test4null.javacodetest800.javacodetest100.test4;

public class test4q24 {
    
    public static void main(String[] args) throws Exception{
    
        try {
            amehtod();
            System.out.println("try ");
            
            
        } catch (Exception e) {
            
            System.out.println("catch ");
            
        } finally {
            System.out.println("finally ");
        }
        
        System.out.println("Out ");
        
    }

    
    //without exception here then just try finally out
    public static void amehtod() { }


    //with exception here - will print catch then finally out
    //public static void amehtod() throws Exception {
      //  throw new Exception("what is exception here...");
    //}
    
}


//output: try finally out