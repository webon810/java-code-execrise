package test4null.javacodetest800.javacodetest100.test2;

public class test2q27 {

    static int mx(int s){
        for(int i=0; i<3; i++){
          s = s + i;
        }
        return s;
    }
    
    public static void main(String[] args){
        int s = 5;
        s += s + mx(s) + ++s;
        System.out.println(s);
    }
    
}


//output is 24
//if comment out for (){} loop, it is 21