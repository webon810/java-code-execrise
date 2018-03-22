package test4null.javacodetest800.javacodetest100.test5;

class q55CorbaComponent{
    
    String ior;
    
    q55CorbaComponent(){ startUp("IOR");}
    
    void startUp(String s) { ior = s; }
    void print(){ System.out.println(ior); }
}

class q55OrderManagement extends q55CorbaComponent {
    
    q55OrderManagement(){ }
    
    void startUp(String s) { ior = getIORFormatURL(s); }
    String getIORFormatURL(String s) { return "URL://" + s;}
    
}

public class test5q55 {
    
    public static void main(String[] args) {
        
        start(new q55OrderManagement());
        //System.out.println("...");
        
    }
    
    static void start(q55CorbaComponent cc) { cc.print();}
    
    
}


//output: URL://IOR