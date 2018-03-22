package test4null.javacodetest800.javacodetest100.test7;


public class test7q45 {
    
    public static void main(String[] args){

        test7q45 s = new q45GoodSpeak();
        
        //this is invalid 
        //s.up();

        //this is valid
        ((q45Tone)s).up();
        
        //this is valid 
        ((q45GoodSpeak)s).up();
        
        System.out.println("Hello...");
        
    }
    
}

class q45GoodSpeak extends test7q45 implements q45Tone {
    
    public void up(){
        
        System.out.println("UP UP UP");
    }
    
}

interface q45Tone{
    void up();
}


//output: UP UP UP