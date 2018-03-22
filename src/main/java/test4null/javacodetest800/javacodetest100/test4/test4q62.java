package test4null.javacodetest800.javacodetest100.test4;

class q62E1 extends Exception {}

class q62E2 extends q62E1 {}


public class test4q62 {
    
    public static void main(String[] args) {
        
        try {
            
            throw new q62E2();
            
        } catch (q62E1 e) {
            
            System.out.println("E1");
            
        } catch (Exception e) {

            System.out.println("E");
            
        }
        
        
        finally {
            System.out.println("Finally");
        }
        
        
    }
}


//output:  E1 Finally