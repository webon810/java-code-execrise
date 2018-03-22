package test4null.javacodetest800.javacodetest100.test3;

public class test3q11 {
    
    public static void main(String[] args) {
        
        String s = "blooper";
        StringBuilder sb = new StringBuilder();
        
        //error - can not find symbol append()
        //s.append();
        sb.append("shopper");

        System.out.println(s);
        System.out.println(sb);
        
    }
    
}

//s.append() - it will cause not compile - not such method for String object
//output : shopper