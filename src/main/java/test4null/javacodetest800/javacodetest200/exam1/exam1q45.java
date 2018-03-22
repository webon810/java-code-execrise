package test4null.javacodetest800.javacodetest200.exam1;

public class exam1q45 {

    static int aVar = 9;

    public static void main(String[] args) {
        if (aVar++ < 10) {
            System.out.println(aVar + " Hello World!");
        } else {
            System.out.println(aVar + " Hello Universe!");
        }
    }
}


//output: 10 Hello Universer!