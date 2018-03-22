package test4null.javacodetest800.javacodetest100.test1;

interface tq18Bozo {
    int type = 0;
    public void jump();
}


public class test1q18 implements tq18Bozo {
    
    public test1q18() {
        
        //it can't assign type from outside interface
        //uncoment this will error - cannot assign a value to final
        //type = 1;
    }
    
    public void jump() {
        System.out.println("jump..." + type);
    }
    
    
    public static void main(String[] args) {
        
        tq18Bozo b = new test1q18();
        b.jump();
        
        //System.out.println("...");
        
    }
    
    
}


//output:  jump... 0 
//need to comment out the assign value part type = 1