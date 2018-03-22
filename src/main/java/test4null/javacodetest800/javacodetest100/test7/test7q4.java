package test4null.javacodetest800.javacodetest100.test7;

public class test7q4 {
    
    static String url = "jdbc://derby://localhost:1527//mydb";
    static test7q4 getDatabase() {
        System.out.println("Getting DB");
        return null;
    };
    
    public static void main(String[] args) {
        System.out.println(getDatabase().url );
    }
    
    
}


//output: 
//Getting DB
//jdbc://derby://localhost:1527//mydb