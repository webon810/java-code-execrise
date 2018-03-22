package test4null.javacodetest800.javacodetest100.test6;

public class test6q25 {
    
    public static void main(String[] args){
        
        int c = 0;
        JACK: while (c<8){
            JILL: System.out.println("c =" + c);
            for (int k= 0; k<c; k++){
                System.out.println(" k =" + k +" c= "+ c);
                if(c>3) break JACK;
            }
        c++;
        }
    
    }

}
//output is list of number 