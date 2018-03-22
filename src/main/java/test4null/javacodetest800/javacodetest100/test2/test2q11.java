package test4null.javacodetest800.javacodetest100.test2;

public class test2q11 {

    public static void main(String[] args) {
       // if(args[0].equals("open"))
         // if(args[1].equals("someone")) 
          //  System.out.println("Hello!");}
       // else System.out.println("Go away ");
        

        if (args.length > 0) {
           System.out.println("Hello " + args[1]);
        } else {
            
            //args[0] or any number will exception in main - java.lang.ArrayIndexOutOfBoundsException
            //System.out.println("args is 0" + args[1]);
            System.out.println("args is 0 " + args.length);
        }

    }

}