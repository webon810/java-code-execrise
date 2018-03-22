package test4null.javacodetest800.javacodetest100.test6;

public class test6q7 {

    //public void loopTest(int x){
     //   loop: for(int i = 1; i <5; i++) {
      //      for(int j=1; j<5; j++){
       //         System.out.println(i);
        //        if(x==0){ continue loop;}
        //        System.out.println(j);
         //   }
       // }
        
   // }
    
    static int x;
    
    public static void main(String[] args){
        
       // test6q7 t6q07 = new test6q7();
        

        loop: for(int i = 1; i <5; i++) {
            for(int j=1; j<5; j++){
                System.out.println(i);
                if(x==0){ continue loop;}
                
                //j never print
                System.out.println(j);
            }
        }
        
       // System.out.println("hello");
        
        //this is incorrect
        //System.out.println(t6q07.loopTest(10));


    }
    

}

//the output should be 1234
//not sure how to print the looptest() here yet in main method()
//add the for loop inside the main block - output 1 2 3 4