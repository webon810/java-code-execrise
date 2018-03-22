package test4null.javacodetest800.javacodetest100.test6;


class q27Automobile {
    public void drive() {
        System.out.println("Automobile: drive");
    }
}


public class test6q27 extends q27Automobile {
    
    public void drive() { System.out.println("Truck: drive");}
    
    public static void main(String[] args){
        
        //System.out.println("Hello...");
        q27Automobile a = new q27Automobile();
        test6q27 t = new test6q27();
        
        a.drive();
        t.drive();
        
        a = t;
        a.drive();
        
        
        
    }
    
}
