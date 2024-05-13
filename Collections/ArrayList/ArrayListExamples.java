package Arrays.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamples {
    public static ArrayList<Integer> OperationsAL(ArrayList<Integer> al){
        return al;
    }
    public static void main(String [] args){
        Integer[] arr = new Integer[] {5,6,7};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
    }
}
