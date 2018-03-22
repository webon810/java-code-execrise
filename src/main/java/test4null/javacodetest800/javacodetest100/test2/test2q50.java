package test4null.javacodetest800.javacodetest100.test2;

public class test2q50 {
    
    public static void main(String[] args){

       // public void method1(int i){
            int i = 20;
            int j = (i*30 - 2)/100;

            POINT1 : for (; j<10; j++) {
                boolean flag = false;
                while (!flag) {
                    if(Math.random()>0.5) break POINT1;
                }
            }

            while(j>0) {
                System.out.println(j--);
                
                //error: undefined label POINT1
                //if( j == 4 ) break POINT1;
                
                //this is OK to print
                if( j == 7 ) break;
            }

       // }
        
    }

 
}
