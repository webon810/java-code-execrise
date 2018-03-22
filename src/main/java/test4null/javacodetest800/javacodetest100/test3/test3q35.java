package test4null.javacodetest800.javacodetest100.test3;

class tq35person {
    
    private int age;
    
    //getter
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}


public class test3q35 extends tq35person {
    
    public static void main(String[] args) {
        
        //create reference
        test3q35 e = new test3q35();
    
        //setter
        e.setAge(76);
        
        System.out.println(e.getAge());
        
    }
    
}


//output: 76
//this is encapsulation - private field with getter setter