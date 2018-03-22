package test4null.javacodetest800.javacodetest100.test5;

public class test5q43 {
    
    public static void main(String[][] args) {
        
        System.out.println(args[0][1]);
        
    }

    public static void main(String[] args) {
        
        test5q43 fwa = new test5q43();

        String[][] newargs = {args};
        
        System.out.println(newargs);

    }
    
}


//java test5q43 a b c --- output b
//String[][] with an argument { {"a", "b", "c"} }  Thus, args[0][1] refers to "b