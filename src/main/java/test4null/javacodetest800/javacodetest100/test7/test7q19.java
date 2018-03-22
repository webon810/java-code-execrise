package test4null.javacodetest800.javacodetest100.test7;


import java.util.ArrayList;
import java.util.function.Predicate;

public class test7q19 {

    int value;

    test7q19(int value){
        this.value = value;
    }
    
    
    public void printUsefulData(ArrayList<test7q19> dataList, Predicate<test7q19> p) {

        for(test7q19 d: dataList){
            if(p.test(d)) System.out.println(d.value);
        }

    }
    
    public static void main(String[] args){
        
        ArrayList<test7q19> al = new ArrayList<test7q19>();
        al.add(new test7q19(1));
        al.add(new test7q19(2));
        al.add(new test7q19(3));
        
        //printUsefulData(al, (test7q19 d) -> {return d.value > 2});
        //printUsefulData(al, d-> d.value>2 );
        
        //System.out.println(
              //  printUsefulData(al, (test7q19 d)-> {return d.value>2;} );
        //);
        
    }


}

//printUsefulData(al, (Data d)-> { return d.value>2; }  );
//printUsefulData(al, d-> d.value>2 );
//Thus, instead of { return d.value>2; }, you can just write d.value>2