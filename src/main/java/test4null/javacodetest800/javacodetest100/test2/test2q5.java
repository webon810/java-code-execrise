package test4null.javacodetest800.javacodetest100.test2;


class Data {
    
    //access modifier is private for encapsulation
    private int x=0, y=0;
    
    public Data(int x, int y){
        this.x = x; 
        this.y = y;
    }
    
    //step1 - add setter
    public void setValues(int x, int y){
        this.x = x;
        this.y = y;
    }

}

public class test2q5 {

    public static void main(String[] args) throws Exception {
        
        Data d = new Data(1,1);
        
        //step2 - set Values to Data class
        d.setValues(2,2);
        
    }
    
}
