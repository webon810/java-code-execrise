package test4null.javacodetest800.javacodetest200.exam1;

public class exam1q40 {
    
    //without static will error - No enclosing instance of type for super()
    public static class Vehicle{
        String type = "4W";
        int maxSpeed = 100;
        Vehicle(String type, int maxSpeed){
            this.type = type;
            this.maxSpeed = maxSpeed;
        }
    }

    public static class Car extends Vehicle {
        String trans;
        //Car(String trans){
        //this.trans = trans;
        //}
        Car(String type, int maxSpeed, String trans){
            super(type, maxSpeed);
            //this(trans);
        }
    }

    public static void main(String[] args){

        //Car c1 = new Car("Auto");
        Car c2 = new Car("4w", 150, "Manual");
        //System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);

    }
    
}
