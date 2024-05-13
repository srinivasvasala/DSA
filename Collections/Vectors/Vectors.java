package Arrays.Collections.Vectors;

import java.util.Vector;

public class Vectors {

    public static Vector<String> createVector(Vector<String> v1){
        return v1;
    }

    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        Vector<String> v2 = new Vector<String>();
        v2.add("Ramesh");
        v2.add("suresh");
        v1.add("srinivas");//Adding elements into the vector
        v1.add("sai");
        v1.add("shyam");
        v1.add(0,"java");//Adding elements in specific index
        v1.addAll(v2); //Adding elements of  other vector elements
        //v1.remove(5);//Removing Element from the vector
        v1.set(1,"collections");
        System.out.println(v1);
        System.out.println(v1.get(0));//Getting Elements from the Vector
        System.out.println(v1.containsAll(v2));
//        v1.removeAll(v2);//Removing Colletion of elements from the Vector
//        v1.clear();//Removing an entire list from vector
//        System.out.println(v1);
        System.out.println(v1.contains("srinivas"));//verifying the elements
        System.out.println(v1.size());
        //v1.toArray();

    }
}
