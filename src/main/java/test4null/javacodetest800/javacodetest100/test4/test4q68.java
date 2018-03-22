package test4null.javacodetest800.javacodetest100.test4;

public class test4q68 {
    
    public static void main(String[] args) {
        
        int x = 10, y =20;
        int dx, dy;
        
        try{
            dx = x%5;
            dy = y/dx;
        } catch (ArithmeticException ae) {
            System.out.println("caught AE");
            dx = 2;
            dy = y/dx;
        }

        x = x/dx;
        y = y/dy;
        System.out.println(dx + " " + dy);
        System.out.println(x + " " + y );
        
    }
}


//output
//caught AE
//2 10
//5 2


