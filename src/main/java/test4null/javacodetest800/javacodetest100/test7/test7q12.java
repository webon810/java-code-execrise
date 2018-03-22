package test4null.javacodetest800.javacodetest100.test7;

interface q12Movable{
    int offset = 100;
    public void move(int dx);
}

interface q12Growable{
    public void grow(int dy);
}

//this is need abstract or error
public abstract class test7q12 implements q12Growable, q12Movable {
    
    public static void main(String[] args){
        
        //System.out.println("Hello...");

        //will output 100 
        System.out.println(q12Movable.offset);
        
        //public void move(int dx){}
        //public void grow(int dy){}

        //public void move(int dx) {
          // System.out.println("in m");
        //}

       // public void grow(int dy) {
           // System.out.println("in g");
       // }
        
    }
    
}


//output here 