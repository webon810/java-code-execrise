package test4null.javacodetest800.javacodetest100.test4;

public class test4q12 {
    
    public static void main(String[] args) {
        
        int c = 0;
        boolean flag = true;
        
        for (int i = 0; i<3; i++) {
            
            while (flag) {
                c++;
                if(i>c || c>5) flag = false;
            }
            
        }
        
        System.out.println(c);
        
    }
    
}


//output: 6