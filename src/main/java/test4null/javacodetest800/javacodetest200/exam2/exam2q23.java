package test4null.javacodetest800.javacodetest200.exam2;

public class exam2q23 {

    String myStr = "7007";

    public void doStuff(String str){
        
        int myNum = 0;
        try{
            
            String myStr = str;
            myNum = Integer.parseInt(myStr);
            
        } catch (NumberFormatException ne) {
            System.err.print("Error");
        }
        
        System.out.println("myStr: " + myStr + ", myNum: " + myNum);
    }

    public static void main(String[] args){
        exam2q23 obj = new exam2q23();
        
        //assign 9009 tostr args
        obj.doStuff("9009");
    }
}
