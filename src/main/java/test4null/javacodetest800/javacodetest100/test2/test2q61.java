package test4null.javacodetest800.javacodetest100.test2;


class Square {
    private double side = 0;
    String color;
    public Square(double length){
        this.side = length;
    }
    public double getSide() { return side; }
    public void setSide(double side) {this.side = side; }
    
}

public class test2q61 {
    
    public static void main(String[] args) throws Exception {
        
        Square mysq = new Square(10);
        mysq.color = "red";
        mysq.setSide(40);
        
        System.out.println(mysq.getSide());
        
    }
}

//output is 40.0


