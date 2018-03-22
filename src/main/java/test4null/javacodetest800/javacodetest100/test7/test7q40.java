package test4null.javacodetest800.javacodetest100.test7;

public class test7q40 {
    
    public void testRefs(String str, StringBuilder sb){
     
        str = str + sb.toString();
        sb.append(str);
        str = null;
        sb = null;
        
    }
    
    public static void main(String[] args){
        
        String s = "aaa";
        StringBuilder sb = new StringBuilder("bbb");
        new test7q40().testRefs(s, sb);
        System.out.println("s=" + s + " sb=" + sb);
    }
}


//output:  s=aaa sb=bbbaaabbb