package test4null.javacodetest800.javacodetest200.exam1;

public class exam1q43 {

    public static void main(String[] args){
        int s1 = 200;
        Integer s2 = 400;
        Long s3 = (long)s1+s2;

        //error: long can't convert to String
        //String s4 = (String)(s3*s2);

        //long s4 = s3*s2;  -- this is valid
        int s4 = (int)(s3*s2);
        System.out.println("Sum is " + s4);
    }
    
}


//output: Sum is 24000