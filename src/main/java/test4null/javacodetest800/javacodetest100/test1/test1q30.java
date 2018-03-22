package test4null.javacodetest800.javacodetest100.test1;

public class test1q30 {
    
    public static int[] getArray() {
        return null;
    }
    
    public static void main(String[] args) throws Exception {
        
        int index = 1;
        
        try{
            
            getArray()[index=2]++;
            
        } catch (Exception e){
            
        }
        
        System.out.println("index = " + index);
    }
    
}

//output: index = 2  //select True