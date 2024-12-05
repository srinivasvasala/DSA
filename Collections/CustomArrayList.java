package Arrays.Collections;

public class CustomArrayList {
    Object[] a = null;
    CustomArrayList(int Size){
        a = new Object[Size];
    }
    CustomArrayList(){
        a = new Object[4];
    }
    int index = 0;
    public void add(Object obj){
        if(index>=a.length){
            int newSize = a.length+(a.length)/2;
            Object[] ar = new Object[newSize];
            for(int i=0;i<a.length;i++){
                ar[i] = a[i];
            }
            a = ar;
          //  a=Arrays.copyOf(a,newSize);
        }
        a[index] = obj;
        index++;
    }

    public static void main(String[] args) {
        CustomArrayList cl = new CustomArrayList();
        cl.add(10);
        cl.add(20);
        cl.add(30);
        cl.add(40);
        cl.add(50);
        cl.add(60);
    }
}