package test4null.javacodetest800.javacodetest100.test2;

public class test2q12 {
    
    public static void main(String[] args){
        try{
            doTest();
        }catch(MyException me){
            System.out.println(me);
        }
    }
    
    static void doTest() throws MyException{
        int[] array = new int[10];
        array[0] = 1000;
        //will print 1000, or array[1] or arry[9] print 0, array[10] is exception in main indexoutofBounds
        //array[10] = 1000;
        //System.out.println(array[10]);  //if array[10] will exception in main 
        doAnotherTest();
    }
    
    static void doAnotherTest() throws MyException{
        throw new MyException("Exception form doAnotherTest");
    }
    
}

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
