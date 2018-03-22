package test4null.javacodetest800.javacodetest100.test2;

public class test2q20 {
    
    public static void main(String[] args){
        int k=0;
        int m=0;
        for(int i=0; i<=3 ;i++){
            
            k++;
            if(i==2){
                //break;
                //continue;
                i=m++;
                //i=4;
            }
            m++;
        }
        System.out.println(k + " "+ m);
    }
    
    
}
