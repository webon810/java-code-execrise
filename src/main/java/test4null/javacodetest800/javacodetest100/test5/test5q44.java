package test4null.javacodetest800.javacodetest100.test5;


class q44Doll {
    
    String name;
    
    //this is constructor - need same name as class or error
    q44Doll(String nm) {
        this.name = nm;
    }
}

class q44Barbie extends q44Doll {
    
    q44Barbie() {
        
        //this q44Barbie nm
        //this("Unknow");
        
        //this is reference to base q44Doll nm
        super("Unknow");
        
    }
    
    q44Barbie(String nm) {
        
        //this q44Barbie nm
        super(nm);
        
        //q44Barbie nm here
        //this("Unknown")
        
    }
    
}

public class test5q44 {
    
    public static void main(String[] args) {
        
        q44Barbie b = new q44Barbie("mysubdoll");
        
        //System.out.println("...");
        
    }
    
    
}
