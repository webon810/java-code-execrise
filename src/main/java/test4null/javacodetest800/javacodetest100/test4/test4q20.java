package test4null.javacodetest800.javacodetest100.test4;

public class test4q20 {
    
    public static void main(String[] args) {
        
        System.out.println(getMsg((char)10));
        
    }

    public static String getMsg(char x) {

        String msg = "Input value must be ";
        msg = msg.concat("smaller thatn X");
        
        //repace doesn't replace the concat since it create new string object
        msg.replace('X', x);
        
        String rest = " and larger than 0";
        msg.concat(rest);
        return msg;

    }

}


//output:  Input value must be smaller than X