package test4null.javacodetest800.javacodetest100.test5;


class q51X {
    
    public q51X() {
        System.out.println("In X");
    }
}
class q51Y extends q51X {
    
    public q51Y() {
        
        //supper will reference q51X to here
        super();
        
        System.out.println("In Y");
    }
    
}
class q51Z extends q51Y {
    
    public q51Z() {
        System.out.println("In Z");
    }
    
}

public class test5q51 {
    
    public static void main(String[] args) {
        
        q51Y y = new q51Z();
        
    }
}

//output:  In X In Y In Z