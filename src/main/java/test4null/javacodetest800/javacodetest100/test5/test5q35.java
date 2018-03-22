package test4null.javacodetest800.javacodetest100.test5;

public class test5q35 {
    
    public int radiusA, radiusB;
    public int sum = 100;
    
    public void setRadius(int r) throws IllegalAccessException {
        
        if (r>99) throw new IllegalAccessException();
        radiusA = r;
        radiusB = sum - radiusA;
        
        //need to println
        System.out.println(radiusB);

        //return i;
    }
    
    public static void main(String[] args) throws Exception {
        
        //create the reference
        //this is just reference the method under same class
        test5q35 q35Rad = new test5q35();
        
        //assign the int 
        q35Rad.setRadius(30);
    }
    
}

//for set private - the encapsulate way - should re-do this code 
//it will need add one more class