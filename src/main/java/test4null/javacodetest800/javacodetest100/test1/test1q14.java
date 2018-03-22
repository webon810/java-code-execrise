package test4null.javacodetest800.javacodetest100.test1;

public class test1q14 {

    static int[][] matrix = new int[2][3];

    static int a[] = {1,2,3};
    static int b[] = {4,5,6};

    public int compute(int x, int y){
        //insert code
        return a[x]*b[y];
        
    }
    
    public void loadMatrix() {
        for(int x= 0; x<matrix.length; x++){
            for(int y=0; y<matrix[x].length; y++){
                //insert code
                matrix[x][y] = compute(x,y);
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        
        test1q14 tq14 = new test1q14();
        
        tq14.compute(1,1);
        
        //System.out.println("...");
        
    }
    
}

//return a[x]*b[y];
//matrix[x][y] = compute(x,y);