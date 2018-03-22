package test4null.javacodetest800.javacodetest100.test6;

public class test6q43 {

    private int myValue = 0;
    //private int myValue2 = 0;
    
    public void showOne(int myValue){
        
        //without this - access the myvalue2 = 0
        //myValue2 = myValue2;
        
        //access the myValue = 200
        myValue = myValue;

        //this will access showOne value 100
        //this.myValue = myValue;
        
    }
    
    public void showTwo(int myValue){
        
        //use this to access instance memeber with value 200
        this.myValue = myValue;
    }
    
    public static void main(String[] args){
        test6q43 ct = new test6q43();
        
        ct.showTwo(200);
        System.out.println(ct.myValue);
        
        ct.showOne(100);
        System.out.println(ct.myValue);
        
    }
    
}






