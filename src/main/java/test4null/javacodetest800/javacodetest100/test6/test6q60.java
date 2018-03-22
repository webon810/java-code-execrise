package test4null.javacodetest800.javacodetest100.test6;

public class test6q60 {
    
    public static void main(String[] args){
        
        String[] dataList = {"x", "y", "z"};
        
        for (String dataElement : dataList) {
            
            int innerCounter = 0;
            
            while (innerCounter < dataList.length) {
                System.out.println(dataElement + ", " + dataList + ", " + innerCounter);
                innerCounter++;
            }
            
        }
        
    }
    
}


//there is 3 times to print 2 (innerCounter)