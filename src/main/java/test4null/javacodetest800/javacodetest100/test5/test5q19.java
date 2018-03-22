package test4null.javacodetest800.javacodetest100.test5;

public class test5q19 {
    
    public static void main(String[] args){
        
        char i;
        LOOP: for (i=0; i<5; i++) {
            
            
            //new loop become 2 due to i++
            switch (i++) {
                
                //i=0 but here is char
                case '0': System.out.println("A");
                case 1: System.out.println("B"); break LOOP;
                //then go here 
                case 2: System.out.println("C"); break ;
                case 3: System.out.println("D"); break ;
                case 4: System.out.println("E");
                case 'E': System.out.println("F");
            }
            
            
        }
        
        
        //System.out.println("...");
        
    }
    
}


//output: C E F