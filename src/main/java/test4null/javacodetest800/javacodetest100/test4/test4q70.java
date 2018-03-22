package test4null.javacodetest800.javacodetest100.test4;

public class test4q70 {
    
    static String j="";
    public static void method(int i) {
        try {
            if(i ==2){
                throw new Exception();
            }
            j += "1";
        } catch (Exception e) {
            j += "2";
            
            //without this return will 134234 - also print 4 in the end
            return;
            
        } finally {
            j += 3;
        }
        j += "4";
    }
    
    public static void main(String[] args) {
        method(1);
        method(2);
        System.out.println(j);
        
    }
    
}


//output: 13423

//without this return will 134234 - also print 4 in the end