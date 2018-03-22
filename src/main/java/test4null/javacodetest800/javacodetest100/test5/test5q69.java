package test4null.javacodetest800.javacodetest100.test5;

public class test5q69 {
    
    public static void main(String[] args) {
        
        int[] arr = { 1,2,3,4,5,6 };
        
        int counter = 0;
        
        for (int value : arr) {
            
            if (counter >= 5) {
                break;
            } else {
                continue;
            } 
            
            //unreachable statement
            //if comment out the first if(){} statement , here is always 6 + 1
            //if (value > 4) {
              //  arr[counter] = value + 1;
            //}
            
            //unreachable statement
            //counter ++;
        }
        
        //here is OK 
        //counter ++;
        
        System.out.println(arr[counter]);
        
    }
}


//comment out if statement will output 1 -arr[0]- counter still 0

// if (value > 4) { and the rest of the code in the for loop will 
// not execute in any case. It is therefore unreachable code 




