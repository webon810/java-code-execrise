package test4null.javacodetest800.javacodetest200.exam1;

public class exam1q57 {

    public static void main(String[] args){
        int array[] = {0,1,2,3,4};
        int key = 3;
        for(int pos=0;pos<array.length;++pos){
            if(array[pos] == key){
                break;
            }
            System.out.println("Found " + key + "at " + pos);
        }
        //pos out of FOR loop will cause error pos underfine
        //System.out.println("Found " + key + "at " + pos);
        System.out.println("Found " + key + " at ");
    }
    
}

//output:
//Found 3 at 0
//Found 3 at 1
//Found 3 at 2
//Found 3 at