package test4null.javacodetest800.javacodetest200.exam2;

public class exame2q77 {
    
    public static void main(String[] args) {
        String[] strs = new String[2];
        int count = 0;
        String strs2;
        for (String s : strs) {
            
            //concat cause exception in main - NullPointerException
            //strs[count].concat(" Hadoopexam" + count);
            
            strs2 = strs[count];
            count++;
        }
        for (count = 0; count < strs.length; count++) {
            System.out.println(strs[count]);
            //result - null null
        }
    }
    
}

//output: null null
//if uncomment concat block - it cause Exception in main - nullPointerException