package test4null.javacodetest800.javacodetest100.test6;


class q49A {
    
    public int getCode(){ return 2;}

}

public class test6q49 extends q49A {
    
    q49A a = new q49A();
    test6q49 aa = new test6q49();

    //q49A a = null;
    //test6q49 aa = null;
    
    
    //the following should be valid
    //a = (test6q49)aa;
    //a = new test6q49;
    //aa = (test6q49)a; 
    
    public void doStuff() {

        //q49A a = null;
        //test6q49 aa = null;
        
    }
    
    public static void main(String[] args){
        
        //System.out.println(test6q49.doStuff());
        
    }
    
}

//this is valid - ((AA)a).doStuff();
//Once you cast a to AA, you can call methods defined in AA.