package test4null.javacodetest800.javacodetest100.test7;

public class test7q29 {
    
    //protect invariant need to set to private
    public int base;
    public int height;
    public double area;

    public test7q29(int base, int height){
        this.base = base;
        this.height = height;
        updateArea();
    }

    void updateArea(){
        area = base*height/2;
    }

    public void setBase(int b){
        base = b;
        updateArea();
    }
    public void setHeight(int h){
        height = h;
        updateArea();
    }
    
    public static void main(String[] args){
        
        test7q29 q29 = new test7q29(10,20);
        
        //q29.base(12);
        //q29.height(15);

        //q29.setBase(30);
        //q29.setHeight(40);
        
        System.out.println(q29.area);
    }
    
}

//protect invariant need to set to private