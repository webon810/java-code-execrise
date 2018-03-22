package test4null.javacodetest800.javacodetest200.exam2;

class q62Overloading {
    
    int x(double d) {
        System.out.println("one");
        
        //return type match int
        return 0;
   }

  //  String x(double d) {
     //   System.out.println("two");
     //   return null;
   // }

  //  Double x(double d) {
     //   System.out.println("three");
     //   return 0.0;
   // }
    
}

public class exam2q62 {
    
    public static void main(String[] args){
        
        new q62Overloading().x(4.0);
        
        //System.out.println("...");
        
    }
    
}


//output: one  (need to comment out other x method block - duplicate)