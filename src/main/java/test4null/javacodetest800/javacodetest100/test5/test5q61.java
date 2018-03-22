package test4null.javacodetest800.javacodetest100.test5;


class q61Car {
    
    public int gearRatio = 8;
    public String accelerate() {
        return "Accelerate: Car";
    }
    
}

public class test5q61 extends q61Car {
    
    public int gearRatio = 9;
    public String accelerate () {
        return "Accelerate : SportsCar";
    } 
    
    public static void main(String[] args) {
        
        //here is Accelerate : SportCar
        q61Car c = new test5q61();

        //method override base on which object reference
        //here is Accelerate: Car
        //q61Car c = new q61Car();
        
        System.out.println(c.gearRatio + " " + c.accelerate());
    
    }
    
}

//output:  8 Accelarate : SportsCar
//variables are hidden and methods are overridden.