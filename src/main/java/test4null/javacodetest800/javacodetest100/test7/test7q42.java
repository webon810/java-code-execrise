package test4null.javacodetest800.javacodetest100.test7;

public class test7q42 {
    
    public static int switchTest(int k){
        
        int j = 1;
        switch (k) {
            case 1: j++;
            case 2: j++;
            case 3: j++;
            case 4: j++;
            case 5: j++;
            default: j++;
        }
        return j + k;
    }
    
    public static void main(String[] args){
        System.out.println( switchTest(4));
    }
}


//output: 8