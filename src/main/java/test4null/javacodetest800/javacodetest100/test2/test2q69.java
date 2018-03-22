package test4null.javacodetest800.javacodetest100.test2;

interface Flyer{ String getName(); }

class Bird implements Flyer{
    
    public String name;
    public Bird(String name) {
        this.name = name;
    }
    public String getName(){ return name; }
    
}

class Eagle extends Bird {
    public Eagle(String name){
        super(name);
    }
}


public class test2q69 {
    public static void main(String[] args){
        Flyer f = new Eagle("American Bald Eagle");
        System.out.println(f.getName());
        System.out.println(((Eagle)f).name);
        //this one looks like same with f.getName() - redundant cast
        System.out.println(((Bird)f).getName());
    }
    
}

//output :  American Bald Eagle