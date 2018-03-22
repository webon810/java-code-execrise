package test4null.javacodetest800.javacodetest200.exam1;

import java.util.ArrayList;

public class exam1q76 {

    public static void main(String[] args){
        ArrayList myList = new ArrayList();
        String[] myArray;
        try{
            System.out.println("Ready to use in try block");
            //while(true){
            //myList.add("My String");
            //}
        }catch(RuntimeException re){
            System.out.println("Caught a RuntimeException");
        }catch(Exception e){
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
    }
    
}

//while(){} statement cause outofmemory
//uncomment out under try block - nothing in try block,
//keep the comment out part, will print those System.out statement
//
//result:  Exception in thread "main" OutOfMemory: Java heap space

//with while block will OK to run but wait a while, it will shows
//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
