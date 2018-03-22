package test4null.javacodetest800.javacodetest100.test3;

public class test3q47 {
    
    
    public static void main(String[] args) {
        
        //args never null, no args is 0
        boolean hasParams = (args==null? false : true) ;
        
        if(hasParams){
            System.out.println("has params");
        }
        
        //no else here
        
        {
            System.out.println("no params");
        }
        
    }
    
}

//output: has params no params