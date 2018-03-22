package test4null.javacodetest800.javacodetest100.test1;


class q21Base {
    
    public Object getValue() {
        return new Object();
    }
    
}


//b point to q21Base2
class q21Base2 extends q21Base {

    //q21Base2 override getValue
    public String getValue(){
        
        return "hello";
    }
}


public class test1q21 {
    
    public static void main(String[] args) {
        
        q21Base b = new q21Base2();

        //if this one, will only q21Base()
        //q21Base b = new q21Base();
        
        System.out.println(b.getValue());
    }
    
}


//output: hello