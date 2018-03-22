package test4null.javacodetest800.javacodetest200.exam2;

import java.util.ArrayList;

public class exam2q49 {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(1);  //1 could be any other number as long as not -1
        list.add(1001);
        list.add(1003);
        list.add(1004);
        // [1001,1003]
        //System.out.println(list);
        //index is start from 0, and last one is 2
        System.out.println(list.get(2));   //this is correct - index is 2 if
        //System.out.println(list.get(list.size()));  //exception in Main - indexOutOfBoundsException - list.size() = 3
        //System.out.println(list.size());  //result is 3
        // System.out.println(list.get(list.size()));
    }


}
