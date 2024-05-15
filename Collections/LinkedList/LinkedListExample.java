package Arrays.Collections.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static LinkedList<String> cratetion(LinkedList<String> ll){
        return ll;
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("srinivs");
        ll.add("vasala");
        ll.add("srimu");
        ll.add("sai");
        System.out.println(ll);
        System.out.println(ll.contains("srinivas"));
        ArrayList<String> al = new ArrayList<>();
        al.add("my");
        al.add("name");
        al.add("is");
        ll.addAll(al);
        System.out.println(ll);
        ll.remove("srimu");
        System.out.println(ll);
        ll.get(2);
    }
}
