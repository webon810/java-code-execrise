package test4null.javacodetest800.javacodetest100.test7;

public class test7q13 {
    public static void main(String[] args){
        
        q13A b = new q13B("good bye");
        //System.out.println("hello...");
    }
}

class q13A{
    q13A() { this("hello", "world"); }
    q13A(String s) { System.out.println(s);}
    q13A(String s1, String s2) { this(s1 + s2); }
}

class q13B extends q13A {
    
    q13B(){ super("good bye"); }
    
    //new q13B call super here
    q13B(String s) { super(s, " world"); }
    
    q13B(String s1, String s2) { this(s1 + s2 + " ! "); }
}


//output: good bye world

//new q13B("good bye"); will call class B's 
// one args constructor which in turn calls super(s, " world")