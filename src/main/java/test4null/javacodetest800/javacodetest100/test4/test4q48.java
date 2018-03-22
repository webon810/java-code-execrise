package test4null.javacodetest800.javacodetest100.test4;

public class test4q48 {

    public static void main(String[] args) {

        int counter = 0;

        outer:

        for (int i = 0; i < 3; i++) {

            middle:
            for (int j = 0; j < 3; j++) {

                inner:
                for (int k = 0; k < 3; k++) {

                    //demo here how print out
                    System.out.println("i="+i+" j="+j+" k="+k);

                    if (k - j > 0) {

                        //demo here how print out
                        System.out.println("breaking middle "+j);
                        
                        break middle;

                    }
                    counter++;
                }
                
            }
            
        }
        System.out.println(counter);
    }

}


//output: 3