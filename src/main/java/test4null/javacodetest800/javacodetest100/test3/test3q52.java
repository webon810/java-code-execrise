package test4null.javacodetest800.javacodetest100.test3;

public class test3q52 {
    
    public static void main(String[] args) {
    
        int i = 1;
        int j = i++;
        if( (i == ++j) | (i++ == j )) {
            i+=j;
        }
        System.out.println(i);
    }
}

//output: 5