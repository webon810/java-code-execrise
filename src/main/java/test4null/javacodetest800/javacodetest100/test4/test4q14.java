package test4null.javacodetest800.javacodetest100.test4;

public class test4q14 {
    
    public static void main(String[] args) {
        
        //for is keyword, cannot use as label
        labelfor : for(int i=0; i<10; i++){ 
            for (int j = 0; j<10; j++) {
                if ( i+j > 10 ) break labelfor;
            }

            System.out.println("Hello");
        }
        
    }
    
}


