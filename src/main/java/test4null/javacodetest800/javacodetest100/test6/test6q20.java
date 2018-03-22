package test4null.javacodetest800.javacodetest100.test6;


class q20Game {
    public void play() throws Exception {
        System.out.println("Playing...");
    }
}


public class test6q20 extends q20Game {
    
    public void play() {
        System.out.println("Playing Soccer...");
    }
    
    //without throws here will compile failed - because q20Game has the 
    //throws, so it should has here too
    //public static void main(String[] args) { 
    
    public static void main(String[] args) throws Exception {
        
        q20Game g = new test6q20();
        g.play();
        //System.out.println("Hello");
        
    }
    
}

//add throws after , will output Playing... 
